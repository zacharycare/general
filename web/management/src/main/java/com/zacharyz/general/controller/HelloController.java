package com.zacharyz.general.controller;

import com.zacharyz.general.util.TimeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /**
     * @author zachary
     * @apiNote 管理平台登录页面
     * @since 2018/4/26 12:36
     */
    @GetMapping(value = "m/login")
    public String index() {
        String time = TimeUtil.getNow();
        return "hello  " + time;
    }
}
