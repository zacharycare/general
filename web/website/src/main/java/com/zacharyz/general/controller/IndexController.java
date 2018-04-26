package com.zacharyz.general.controller;

import com.zacharyz.general.util.TimeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页控制器
 */
@RestController
public class IndexController {
    @GetMapping(value = "")
    public String index() {
        String time = TimeUtil.getNow();
        return "this is home page  " + time;
    }
}
