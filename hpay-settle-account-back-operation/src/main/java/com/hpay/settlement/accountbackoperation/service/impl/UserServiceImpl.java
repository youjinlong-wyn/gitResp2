package com.hpay.settlement.accountbackoperation.service.impl;

import com.hpay.settlement.accountbackoperation.entity.User;
import com.hpay.settlement.accountbackoperation.mapper.UserMapper;
import com.hpay.settlement.accountbackoperation.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jlyou
 * @since 2021-01-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
