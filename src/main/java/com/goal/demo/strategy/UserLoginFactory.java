package com.goal.demo.strategy;

import com.goal.demo.config.LoginTypeConfig;
import jakarta.annotation.Resource;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * ApplicationContextAware 接口，与 Bean 生命周期相关
 */
@Component
public class UserLoginFactory implements ApplicationContextAware {

    private static final Map<String, UserGranter> granterPool = new HashMap<>();

    @Resource
    private LoginTypeConfig loginTypeConfig;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        loginTypeConfig.getTypes().forEach((k, v) -> {
            granterPool.put(k, (UserGranter) applicationContext.getBean(v));
        });
    }

    /**
     * 获取具体的策略
     * @param granterType
     * @return
     */
    public UserGranter getGranter(String granterType) {
        return granterPool.get(granterType);
    }
}
