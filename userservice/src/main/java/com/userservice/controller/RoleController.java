package com.userservice.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.userservice.modal.vo.RoleVo;
import com.userservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 角色服务
 * Created by junfeng on 17-11-11.
 */
@RequestMapping("/role-api")
@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public JSONArray getAllRole(){
        List<RoleVo> roles = roleService.getAllRole();
        JSONArray results = (JSONArray) JSONArray.toJSON(roles);
        return results;
    }

}
