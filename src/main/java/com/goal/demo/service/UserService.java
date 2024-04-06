package com.goal.demo.service;

import com.goal.demo.model.LoginReq;
import com.goal.demo.model.LoginResp;
import com.goal.demo.strategy.UserGranter;
import com.goal.demo.strategy.UserLoginFactory;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /**
     * 用于获取策略
     */
    @Resource
    private UserLoginFactory userLoginFactory;

    public LoginResp login(LoginReq loginReq) {
        // 1. 获取策略
        UserGranter granter = userLoginFactory.getGranter(loginReq.getType());
        if (granter == null) {
            LoginResp resp = new LoginResp();
            resp.setSuccess(false);
            return resp;
        }

        // 2. 进行登录
        return granter.login(loginReq);
    }

}
