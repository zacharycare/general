package com.zacharyz.general.controller;

import com.zacharyz.general.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImageController {

    @Autowired
    ImageService imageService;

    @GetMapping(value = "manage/uploadImage")
    public String upload(Model model){
        return "image/uploadImage";
    }
}
