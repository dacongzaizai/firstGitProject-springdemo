package com.qiyi.manage.service.finance.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiyi.manage.dao.UserMapper;
import com.qiyi.manage.dao.finance.FinanceMapper;
import com.qiyi.manage.entity.Person;
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
	public List<Person> getPerson(String id) {
		// TODO Auto-generated method stub
		return financeMapper.getPerson("1");
	}

	@Override
	public List<Person> getPerson1(String id, String name) {
		// TODO Auto-generated method stub
		return financeMapper.getPerson1("1", "admin");
	}

	@Override
	public List<Person> getPerson2(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return financeMapper.getPerson2(map);
	}

}
