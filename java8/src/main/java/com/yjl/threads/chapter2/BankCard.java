package com.yjl.threads.chapter2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 描述类的职责 TODO
 *
 * @author: jlyou
 * @date: 2020-12-20 16:04
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankCard {
    private BigDecimal money = BigDecimal.ZERO;
}


