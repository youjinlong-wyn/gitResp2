package com.yjl.boot.config;

import com.yjl.boot.bean.Pet;
import com.yjl.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-22 16:09
 **/
@Configuration(proxyBeanMethods = true)
public class MyConfig {
    //方法名字，作为主键的id
    //返回类型是主键类型
    //返回的值，就是组件在容器中的实例
    @Bean
    public User user01() {
        return new User("zhangsan", 18);
    }

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }

}
