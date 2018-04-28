package com.zacharyz.general.controller;

import com.zacharyz.general.bean.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zachary
 * @apiNote 登录认证控制器
 * @since 2018/4/27 15:08
 */
@RestController
public class AuthController {
    /**
     * @author zachary
     * @apiNote 管理平台登录
     * @since 2018/4/27 15:10
     */
    @PostMapping(value = "m/login")
    public String login(@RequestBody User user){
        System.out.println(user);
        //判断非空
        if (StringUtils.isAnyBlank(user.getUsername(),user.getPassword())){
            return "请填写登录信息";
        }

        return "可登录";
    }
}
