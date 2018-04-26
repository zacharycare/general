package com.zacharyz.general.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zacharyz.general.bean.Image;
import com.zacharyz.general.dao.ImageDao;
import com.zacharyz.general.service.ImageService;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl extends ServiceImpl<ImageDao,Image> implements ImageService {
}
