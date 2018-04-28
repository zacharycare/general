package com.zacharyz.general.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zacharyz.general.bean.User;
import com.zacharyz.general.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zachary
 * @apiNote 登录认证控制器
 * @since 2018/4/27 15:08
 */
@Controller
public class AuthController {
    @Autowired
    UserService userService;

    /**
     * @author zachary
     * @apiNote 管理平台登录
     * @since 2018/4/27 15:10
     */
    @PostMapping(value = "m/login")
    @ResponseBody
    public String login(@RequestBody User user, HttpServletResponse response) {
        System.out.println(user);
        //判断非空
        if (StringUtils.isAnyBlank(user.getUsername(), user.getPassword())) {
            return "请填写登录信息";
        } else if (userService.selectOne(new EntityWrapper<User>().eq("username", user.getUsername()).eq("password", user.getPassword())) == null) {
            return "用户名或密码错误";
        }
        return "1";
    }

    @GetMapping(value = "m")
    public String management() {
        return "manage";
    }
}
