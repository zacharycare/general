package com.zacharyz.general.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zacharyz.general.bean.User;
import com.zacharyz.general.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author zachary
 * @apiNote 登录认证控制器
 * @since 2018/4/27 15:08
 */
@Controller
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping(value = "")
    public String index(){
        return "index";
    }

    /**
     * @author zachary
     * @apiNote 管理平台登录
     * @since 2018/4/27 15:10
     */
    @PostMapping(value = "")
    @ResponseBody
    public String login(@RequestBody User user, HttpServletResponse response, HttpSession session) {
        //判断非空
        if (StringUtils.isAnyBlank(user.getUsername(), user.getPassword())) {
            return "请填写登录信息";
        } else {
            user = userService.selectOne(new EntityWrapper<User>().eq("username", user.getUsername()).eq("password", user.getPassword()));
            if (user == null) {
                return "用户名或密码错误";
            } else {
                session.setAttribute("user", user);
                return "1";
            }
        }
    }

    @GetMapping(value = "m")
    public String management() {
        return "manage";
    }

    @GetMapping(value = "denied")
    public String deny(HttpServletRequest request, Model model) {
        StringBuilder loginUrl = new StringBuilder();
        loginUrl.append(request.getScheme());
        loginUrl.append("://");
        loginUrl.append(request.getServerName());
        loginUrl.append(":");
        loginUrl.append(request.getServerPort());
        loginUrl.append(request.getContextPath());
        model.addAttribute("loginUrl", loginUrl);
        return "deny";
    }
}
