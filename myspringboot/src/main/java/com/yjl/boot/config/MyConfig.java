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
    //�������֣���Ϊ������id
    //������������������
    //���ص�ֵ����������������е�ʵ��
    @Bean
    public User user01() {
        return new User("zhangsan", 18);
    }

    @Bean("tom")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }

}
