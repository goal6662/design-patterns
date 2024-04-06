package com.goal.demo.strategy;

import com.goal.demo.model.LoginReq;
import com.goal.demo.model.LoginResp;
import org.springframework.stereotype.Component;

@Component
public class WeChatGranter implements UserGranter {
    @Override
    public LoginResp login(LoginReq loginReq) {
        System.out.println("策略：微信登录");

        // TODO: 2024/4/6

        return new LoginResp();
    }
}
