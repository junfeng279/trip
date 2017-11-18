package com.zuul.controller;

import com.alibaba.fastjson.JSONObject;
import com.zuul.filter.JwtAuthenticationRequest;
import com.zuul.filter.JwtAuthenticationResponse;
import com.zuul.service.AuthService;
import org.apache.http.auth.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
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
    @Value("${jwt.header}")
    private String tokenHeader;
    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String login(@RequestBody JwtAuthenticationRequest authenticationRequest) throws AuthenticationException {
        final String token = authService.login(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        // Return the token
        return token;
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
        return authService.register(addedUser);
    }
}
