package com.yjl.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yjl.mybatisplus.entity.User;
import com.yjl.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * �������ְ�� TODO
 *
 * @author: jlyou
 * @date: 2020-12-19 16:21
 **/
@SpringBootTest
public class TestQueryWapper {

    @Resource
    private UserMapper userMapper;


    @Test
    void contextLoads() { // ��ѯname��Ϊ�յ��û����������䲻Ϊ�յ��û���������ڵ���12
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.isNotNull("name").isNotNull("email").ge("age", 12);
        userMapper.selectList(wrapper).forEach(System.out::println);
    }

    @Test
    void test2() { //
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "jlyou_7");
        User user = userMapper.selectOne(wrapper); // ��ѯһ�����ݣ����ֶ�����ʹ��List ���� Map
        System.out.println(user);
    }

    @Test
    void test3() { // ��ѯ������ 20 ~ 30 ��֮����û�
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("age", 20, 30); // ����
        Integer count = userMapper.selectCount(wrapper);// ��ѯ�����
        System.out.println(count);
    }

    @Test
    void test4() { // ��ѯ������ 20 ~ 30 ��֮����û�
        // %e%(String), t%(String)
        QueryWrapper<User> wrapper = new QueryWrapper<>(); // ����� t%
        wrapper.notLike("name", "e").likeRight("email", "t");
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);
    }

    @Test
    void test5() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        // id ���Ӳ�ѯ�в����
        wrapper.inSql("id", "select id from user where id<10");
        List<Object> objects = userMapper.selectObjs(wrapper);
        objects.forEach(System.out::println);
    }

    @Test
    void test6() {
        QueryWrapper<User> wrapper = new QueryWrapper<>(); // ͨ��id��������
        wrapper.orderByAsc("id");
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }
}




