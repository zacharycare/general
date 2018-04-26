package com.zacharyz.general.bean;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName(value = "image")
public class Image implements Serializable {

    private Long id;

    private String name;

    private String url;

    private String createTime;
}
