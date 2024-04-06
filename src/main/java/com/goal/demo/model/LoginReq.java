package com.goal.demo.model;

import lombok.Data;

@Data
public class LoginReq {

    private String name;

    private String password;

    private String phone;

    private String validateCode;

    private String wxCode;

    /**
     * account: 账号密码
     * sms: 手机验证码
     * we_chat: 微信
     */
    private String type;

}
