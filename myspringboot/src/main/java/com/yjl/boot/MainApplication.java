package com.yjl.boot;

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
        //Pet tom1 = run.getBean("tom", Pet.class);
        //Pet tom2 = run.getBean("tom", Pet.class);
        //System.out.println(tom1 == tom2);

        //MyConfig bean = run.getBean(MyConfig.class);
        //
        //Pet tom3 = bean.tomcatPet();
        //Pet tom4 = bean.tomcatPet();
        //System.out.println(tom3 == tom4);
        //
        //User user01 = run.getBean("user01", User.class);
        //System.out.println(user01.getPet()==tom1);
        //
        //String[] beanNamesForType = run.getBeanNamesForType(User.class);
        //for (String s : beanNamesForType) {
        //    System.out.println(s);
        //
        //}
        //
        //DBHelper bean1 = run.getBean(DBHelper.class);
        //System.out.println(bean1);
        //
        //String[] beanNamesForType2 = run.getBeanNamesForType(DBHelper.class);
        //for (String s : beanNamesForType2) {
        //    System.out.println(s);
        //}
        boolean tomExists = run.containsBean("tom22");
        System.out.println(tomExists);

        boolean user01Exist = run.containsBean("user01");
        System.out.println(user01Exist);


    }

}
