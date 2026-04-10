用户管理系统
需求分析
    1.登录/注册
    2.用户管理（仅管理员可见）对用户的查询和修改
    3.用户校验（仅星球用户）
技术选型
    前端：三件套+React+组件库Ant Design+umi+ Ant Design Pro
    后端：java + spring + springmvc + mybaits-plus + springboot + mysql
部署
    服务器/容器
    初始化项目
前端
后端
准备组件
初始化后端，引入框架
数据库设计
    表，字段，字段类型，索引
    用户表
    id（主键） bigint
    username 昵称 varcher
    userAccount 登录账号 varcher
    avatarUrl 头像 varcher
    gender 性别 tinyint
    userPassword 密码 varcher
    phone 电话 varcher
    email 邮箱 varcher
    userStatus 用户状态 int
    createTime 创建时间 datetime
    updateTime 更新时间 datetime
    isDelete 是否删除 0 1 tinyint
登录/注册
注册
    1用户在前端输入账户和密码、以及校验码(todo)
    2.校验用户的账户、密码、校验密码，是否符合要求
    1.账户的话不小于4位
    2.密码就不小于8位吧
    3.账户不能重复
    4.账户不包含特殊字符
    5.密码和校验密码相同
    3.对密码进行加密(密码千万不要直接以明文存储到数据库中)
    4.向数据库插入用户数据
登录
    1.校验用户账户和密码是否合法
    1.非空
    2.账户长度不小于4位
    3.密码就不小于8位吧
    4.账户不包含特殊字符
    2.校验密码是否输入正确，要和数据库中的密文密码去对比
    3.我们要记录用户的登录态(session)，将其存到服务器上(用后端SpringBoot框架封装的服务器tomcat去记录)cookie
    4.返回用户信息(脱敏)
如何知道是哪个用户登录了?
    1.连接服务器端后，得到一个session1状态，返回给前端
    2.登录成功后，得到了登录成功的session，给该session设置一些值，返回给前端一个设置cookie的”命令”
    3.前端接收到后端的命令后，设置cookie，保存到浏览器内
    4.前端再次请求后端的时候(相同的域名)，在请求头中带上cookie去请求
    5.后端拿到前端传来的cookie，找到对应的session6.后端从session中可以取出基于该session存储的变量(用户的登录信息、登录名)
用户管理接口
    注册
    登录
    管理员根据用户名查找用户
    管理员根据用户名删除用户