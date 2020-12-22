package com.yjl.boot;

import com.yjl.boot.bean.Pet;
import com.yjl.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * TODO
 *
 * @author: jlyou
 * @date: 2020-12-22 14:54
 **/
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //String[] beanDefinitionNames = run.getBeanDefinitionNames();
        //for (String beanDefinitionName : beanDefinitionNames) {
        //    System.out.println(beanDefinitionName);
        //}

        //从容器中获取组件
        Pet tom1 = run.getBean("tom", Pet.class);
        Pet tom2 = run.getBean("tom", Pet.class);
        System.out.println(tom1 == tom2);

        MyConfig bean1 = run.getBean(MyConfig.class);
        MyConfig bean2 = run.getBean(MyConfig.class);
        System.out.println(bean1 == bean2);

        Pet tom3 = bean1.tomcatPet();
        Pet tom4 = bean1.tomcatPet();
        System.out.println(tom3 == tom4);

    }

}
