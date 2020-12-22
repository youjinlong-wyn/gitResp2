package com.yjl.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.yjl.boot.bean.Car;
import com.yjl.boot.bean.Pet;
import com.yjl.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-22 16:09
 **/
@Configuration(proxyBeanMethods = true)
@Import({User.class, DBHelper.class})
@EnableConfigurationProperties(Car.class)
public class MyConfig {
    //方法名字，作为主键的id
    //返回类型是主键类型
    //返回的值，就是组件在容器中的实例
    @Bean
    public User user01() {
        User zhangsan = new User("zhangsan", 18);
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }

}
