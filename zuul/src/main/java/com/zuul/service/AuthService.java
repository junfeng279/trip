package com.zuul.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by junfeng on 17-11-11.
 */
public interface AuthService {
    /**
     * 注册注册用户
     * @param userToAdd
     * @return
     */
    JSONObject register(JSONObject userToAdd);

    /**
     * 用户登录，登录成功返回token信息
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * Token信息刷新
     * @param oldToken
     * @return
     */
    String refresh(String oldToken);
}
