package com.qiyi.manage.service.finance;

import java.util.List;
import java.util.Map;

import com.qiyi.manage.entity.Person;
import com.qiyi.manage.entity.User;

public interface IUserService {

	 public List<User> getUser();
	 
	 public List<Person> getPerson(String id);
	 
	 public List<Person> getPerson1(String id,String name);
	 
	 public List<Person> getPerson2(Map<String,Object> map );
}
