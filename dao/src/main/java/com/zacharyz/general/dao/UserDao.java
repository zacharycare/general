package com.zacharyz.general.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zacharyz.general.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
