# 使用多阶段构建优化镜像大小
# 第一阶段：构建阶段
FROM maven:3.8.6-openjdk-17-slim AS builder

# 设置工作目录
WORKDIR /app

# 复制 pom.xml 并下载依赖（利用Docker缓存）
COPY pom.xml .
RUN mvn dependency:go-offline -B

# 复制源代码
COPY src ./src

# 打包应用，跳过测试
RUN mvn clean package -DskipTests

# 第二阶段：运行阶段
FROM openjdk:17-slim

# 设置工作目录
WORKDIR /app

# 从构建阶段复制打包好的jar文件
COPY --from=builder /app/target/*.jar app.jar

# 暴露应用端口
EXPOSE 8080

# 设置JVM参数
ENV JAVA_OPTS="-Xms512m -Xmx1024m -Djava.security.egd=file:/dev/./urandom"

# 启动应用
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
