package com.goal.demo.strategy;

import com.goal.demo.model.LoginReq;
import com.goal.demo.model.LoginResp;

/**
 * 抽象策略类
 */
public interface UserGranter {

    /**
     * 获取数据
     * @param loginReq
     * @return map 值
     */
    LoginResp login(LoginReq loginReq);

}
