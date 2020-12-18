package com.yjl.mybatisplus;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yjl.mybatisplus.entity.User;
import com.yjl.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MybatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testInsert() {

        for (int i = 1; i <= 50; i++) {
            User user = new User();
            user.setName("jlyou_" + i);
            user.setAge(i);
            user.setEmail("632853406@qq.com_" + i);
            userMapper.insert(user);

        }

        //User user = new User();
        //user.setName("jlyou");
        //user.setAge(32);
        //user.setEmail("632853406@qq.coom");
        //int effectRows = userMapper.insert(user);
        //System.out.println(effectRows);
        //System.out.println(user);


    }

    @Test
    public void testUpdate() {

        User user = new User();
        user.setId(1339935256376307716L);
        user.setName("jlyou111");
        user.setAge(11);
        user.setEmail("1111@qq.coom");
        int effectRows = userMapper.updateById(user);
        System.out.println(effectRows);
        System.out.println(user);


    }

    @Test
    public void testVersion() {
        User user = userMapper.selectById(1339935256376307716L);
        user.setName("jlyou222");
        user.setAge(22);
        user.setEmail("222@qq.coom");
        int effectRows = userMapper.updateById(user);
        System.out.println(effectRows);
        System.out.println(user);

    }

    @Test
    public void testQuery() {
        // 按id批量查询
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L));
        users.forEach(System.out::println);


        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", "Jone");
        paramMap.put("age", 18);

        List<User> users1 = userMapper.selectByMap(paramMap);
        users1.forEach(System.out::println);

    }

    @Test
    public void testPage() {
        Page<User> page = new Page<>(3, 20);
        page.setSearchCount(false);


        userMapper.selectPage(page, null);
        page.getRecords().forEach(System.out::println);

        System.out.println(JSON.toJSONString(page, true));


    }


}
