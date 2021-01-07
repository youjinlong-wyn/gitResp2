package com.yjl.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-23 10:28
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "person")
@Component
public class Person {

    private String userName;

    private Boolean boss;

    private Date birth;

    private Integer age;

    private Pet pet;

    private String[] interests;

    private List<String> animal;

    private Map<String, Object> score;

    private Set<Double> salarys;

    private Map<String, List<Pet>> allPets;

}
