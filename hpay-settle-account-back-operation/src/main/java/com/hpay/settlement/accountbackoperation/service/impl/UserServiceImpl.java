package com.hpay.settlement.accountbackoperation.service.impl;

import com.hpay.settlement.accountbackoperation.db.entity.User;
import com.hpay.settlement.accountbackoperation.db.mapper.UserMapper;
import com.hpay.settlement.accountbackoperation.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jlyou
 * @since 2021-01-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
