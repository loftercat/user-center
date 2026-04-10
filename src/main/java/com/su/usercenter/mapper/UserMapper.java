
package com.su.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.su.usercenter.model.User;

/**
 * 用户Mapper接口
 */
//启动器已经注解@MapperScan("com.su.usercenter.mapper")，无需单独注解@Mapper
public interface UserMapper extends BaseMapper<User> {
}
