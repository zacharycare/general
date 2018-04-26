package com.zacharyz.general.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zacharyz.general.bean.Image;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImageDao extends BaseMapper<Image> {
}
