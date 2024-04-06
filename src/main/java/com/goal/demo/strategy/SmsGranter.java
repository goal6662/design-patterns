package com.goal.demo.strategy;

import com.goal.demo.model.LoginReq;
import com.goal.demo.model.LoginResp;
import org.springframework.stereotype.Component;

@Component
public class SmsGranter implements UserGranter {
    @Override
    public LoginResp login(LoginReq loginReq) {
        System.out.println("策略：手机验证码登录");

        // TODO: 2024/4/6

        return new LoginResp();
    }
}
