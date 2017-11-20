package com.zuul.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.netflix.discovery.converters.Auto;
import com.zuul.filter.JwtAuthenticationRequest;
import com.zuul.filter.JwtAuthenticationResponse;
import com.zuul.service.AuthService;
import com.zuul.service.UserService;
import org.apache.http.auth.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 认证服务
 * Created by junfeng on 17-11-11.
 */
@RestController
public class AuthController {
    @Autowired
    private AuthService authService;
    @Autowired
    private UserService userService;
    @Value("${jwt.header}")
    private String tokenHeader;
    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public JSONObject login(@RequestBody JwtAuthenticationRequest authenticationRequest) throws AuthenticationException {
        JSONObject result = new JSONObject();
        final String token = authService.login(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        result.put("token", token);
        // Return the token
        return result;
    }
    @RequestMapping(value = "/auth/users", method = RequestMethod.GET)
    public JSONArray getUsers() throws AuthenticationException {
        JSONArray results = userService.getAllUsers();
        return results;
    }

    @RequestMapping(value = "${jwt.route.authentication.refresh}", method = RequestMethod.GET)
    public ResponseEntity<?> refreshAndGetAuthenticationToken(
            HttpServletRequest request) throws AuthenticationException{
        String token = request.getHeader(tokenHeader);
        String refreshedToken = authService.refresh(token);
        if(refreshedToken == null) {
            return ResponseEntity.badRequest().body(null);
        } else {
            return ResponseEntity.ok(new JwtAuthenticationResponse(refreshedToken));
        }
    }

    @RequestMapping(value = "${jwt.route.authentication.register}", method = RequestMethod.POST)
    public JSONObject register(@RequestBody JSONObject addedUser) throws AuthenticationException{
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        final String rawPassword = addedUser.getString("password");
        addedUser.put("password", encoder.encode(rawPassword));
        return authService.register(addedUser);
    }
}
