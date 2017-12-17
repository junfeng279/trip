package com.wantrip.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.wantrip.modal.bo.RestResponseBo;
import com.wantrip.modal.vo.CommentVo;
import com.wantrip.modal.vo.ContentVo;
import com.wantrip.service.ICommentService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 评论管理服务
 * Created by junfeng on 17-12-17.
 */
@RestController("/comment")
public class CommentsController {
    @Autowired
    private ICommentService commentService;

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public RestResponseBo getAllComments(@RequestBody String params){
        if(StringUtils.isEmpty(params) || StringUtils.isBlank(params)){
            RestResponseBo.fail("参数不能为空");
        }
        JSONObject obj = JSONObject.parseObject(params);
        Integer p = obj.getInteger("page");
        Integer limit = obj.getInteger("limit");
        if(limit==null || p==null){
            RestResponseBo.fail("当前页和每页条数都不能为空");
        }

        return RestResponseBo.ok();
    }

}
