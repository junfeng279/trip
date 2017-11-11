package com.userservice.controller;

import com.alibaba.fastjson.JSONArray;
import com.userservice.modal.vo.PermissionVo;
import com.userservice.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 权限服务
 * Created by junfeng on 17-11-11.
 */
@RequestMapping("/per-api")
@RestController
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping(value = "/permissions", method = RequestMethod.GET)
    public JSONArray getAllPermission(){
        List<PermissionVo> permissions = permissionService.findAllPermission();
        JSONArray result = (JSONArray) JSONArray.toJSON(permissions);
        return result;
    }
}
