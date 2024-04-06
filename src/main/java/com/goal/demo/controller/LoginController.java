package com.goal.demo.controller;

import com.goal.demo.model.LoginReq;
import com.goal.demo.model.LoginResp;
import com.goal.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class LoginController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public LoginResp login(@RequestBody LoginReq loginReq) {
        return userService.login(loginReq);
    }

}
