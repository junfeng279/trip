package com.zuul.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * Created by junfeng on 17-11-11.
 */
@Service
@FeignClient(value = "userservice")
public interface UserService {

    @RequestMapping(value = "/user-api/users", method = RequestMethod.GET)
    JSONArray getAllUsers();

    @RequestMapping(value = "/user/{username}", method = RequestMethod.POST)
    JSONObject findUserByName(@PathVariable(value = "username") String username);

    @RequestMapping(value = "/per-api/permission/{uid}", method = RequestMethod.GET)
    JSONArray findByAdminUserId(@PathVariable(value = "uid") Integer uid);

    @RequestMapping(value = "/user-api/user/", method = RequestMethod.POST)
    JSONObject addUser(@RequestBody JSONObject userVo);

}
