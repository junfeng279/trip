package com.wantrip.controller;

import com.wantrip.utils.TaleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;



/**
 * 附件管理
 *
 * Created by 13 on 2017/2/21.
 */
@Controller
@RequestMapping("admin/attach")
public class AttachController{

    private static final Logger LOGGER = LoggerFactory.getLogger(AttachController.class);

    public static final String CLASSPATH = TaleUtils.getUplodFilePath();


}
