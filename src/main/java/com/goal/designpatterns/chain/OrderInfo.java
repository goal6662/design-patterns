package com.goal.designpatterns.chain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderInfo {

    private String productId;

    private String userId;

    private BigDecimal amount;
}
