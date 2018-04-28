package com.zacharyz.general.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zacharyz.general.bean.User;
import com.zacharyz.general.dao.UserDao;
import com.zacharyz.general.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
