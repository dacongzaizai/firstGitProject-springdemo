package com.qiyi.manage.service.finance.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiyi.manage.dao.UserMapper;
import com.qiyi.manage.dao.finance.FinanceMapper;
import com.qiyi.manage.entity.User;
import com.qiyi.manage.service.finance.IUserService;
@Service
public class IUserServiceImpl implements IUserService {

	@Autowired
    private UserMapper userMapper;
	
	@Autowired
    private FinanceMapper financeMapper;
	
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userMapper.getUser();
	}

	@Override
	public List<User> getFUser() {
		// TODO Auto-generated method stub
		return financeMapper.getFUser();
	}

}
