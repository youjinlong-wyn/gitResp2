package com.hpay.settlement.accountbackoperation.controller;


import com.hpay.settlement.accountbackoperation.entity.User;
import com.hpay.settlement.accountbackoperation.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jlyou
 * @since 2021-01-06
 */
@RestController
@RequestMapping("/accountbackoperation/user")
@Slf4j
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/queryUser/{id}")
    public User queryUser(@PathVariable String id) {
        log.info("查询id{}", id);
        return userService.getById(id);
    }

}

