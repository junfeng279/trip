package com.userservice.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.userservice.modal.vo.UserVo;
import com.userservice.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 用户服务
 * Created by junfeng on 17-11-11.
 */
@RestController
@RequestMapping("/user-api")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public JSONArray getAllUsers(){
        List<UserVo> users = userService.findAllUsers();
        JSONArray result = (JSONArray) JSON.toJSON(users);
        return result;
    }
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public JSONObject addUser(@RequestBody UserVo userVo){
        JSONObject result = new JSONObject();
        if(userVo==null){
            result.put("code", "用户不能为空");
            return result;
        }
        try {
            userService.addUser(userVo);
            result.put("code", "用户添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code", "用户添加失败");
            result.put("message", e.getMessage());
        }
        return result;
    }
    @RequestMapping(value = "/user/{username}", method = RequestMethod.POST)
    public JSONObject findUserByName(@PathVariable(value = "username") String username){
        JSONObject result = new JSONObject();
        logger.info(">>>>>>>>>>>>>>>>>>findUserByName>>>>>>>>username"+username);
     //   JSONObject params = JSONObject.parseObject(username);
     //   String name = params.getString("username");
        if(StringUtils.isBlank(username)){
            result.put("code", "用户名称不能为空");
            return result;
        }
        UserVo user = userService.findByUserName(username);
        logger.info(">>>>>>>>>>>>>>>>>>findUserByName>>>>>>>>user:"+user.getUsername()+" || password:"+user.getPassword());
        result = (JSONObject) JSON.toJSON(user);
        return result;
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public JSONObject updateUser(@RequestBody UserVo userVo){
        JSONObject result = new JSONObject();
        if(userVo==null){
            result.put("code", "用户不能为空");
            return result;
        }

        try {
            userService.updateUser(userVo);
            result.put("code", "更新用户成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.put("code", e.getMessage());
        }
        return result;
    }

    @RequestMapping(value = "/user/{uid}", method = RequestMethod.DELETE)
    public JSONObject deleteUser(@PathVariable Integer uid){
        JSONObject result = new JSONObject();
        if(uid==null){
            result.put("code", "用户主键id不能为空");
            return result;
        }
        userService.deleteById(uid);
        result.put("code", "删除用户成功");
        return result;
    }
}
