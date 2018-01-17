package com.wantrip.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户服务
 * Created by junfeng on 17-12-12.
 */
@Service
@FeignClient(name = "userservice")

public interface IUserService {
    @RequestMapping(value = "/user-api/user/{username}", method = RequestMethod.POST)
    JSONObject findUserByName(@PathVariable(value = "username") String username);
}
