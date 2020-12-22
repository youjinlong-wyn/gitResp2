package com.yjl.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-22 21:24
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;

}


