package com.zuul.service;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by junfeng on 17-11-11.
 */
@Service
public class CustomUserService implements UserDetailsService {
    private static Logger logger= LoggerFactory.getLogger(CustomUserService.class);
    @Resource
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info(">>>>>>>>>>>>>>>>>>>username:"+username);
        JSONObject user = userService.findUserByName(username);
        logger.info(">>>>>>>>>>>>>>>>>>>user:"+user);
        if(user!=null){
            JSONArray permissions = userService.findByAdminUserId(user.getInteger("id"));
            List<GrantedAuthority> grantedAuthorities = new ArrayList <>();
            for(Object permission: permissions){
                JSONObject per = (JSONObject) JSONObject.toJSON(permission);
                logger.info(">>>>>>>>>>>>>>>>>>>permission:"+per.getString("name"));
                if(per!=null && StringUtils.isNotBlank(per.getString("name"))){
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(per.getString("name"));
                    //1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。
                    grantedAuthorities.add(grantedAuthority);
                    logger.info("权限名称："+per.getString("name"));
                }
            }
            return new User(user.getString("username"), user.getString("password"), grantedAuthorities);
        }else{
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }
}
