package com.wantrip.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by junfeng on 17-12-13.
 */
@Service
@FeignClient(name = "zuul")
public interface IZuulUser {
    @RequestMapping(value = "/auth/login/user", method = RequestMethod.GET)
    JSONObject getLoginUser();
}
