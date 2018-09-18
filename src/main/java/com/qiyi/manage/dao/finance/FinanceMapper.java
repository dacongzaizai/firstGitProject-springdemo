package com.qiyi.manage.dao.finance;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.qiyi.manage.entity.Person;

@Mapper
public interface FinanceMapper {

	//三种注解参数方式
	@Select("SELECT * FROM T_SEC_USER where F_ID=#{id}")
    List<Person> getPerson(String id);
	
	
	@Select("SELECT * FROM T_SEC_USER where F_ID=#{id} and F_USER_NAME=#{f_name}")
    List<Person> getPerson1(@Param("id") String id,@Param("f_name") String f_name);
	
	
	@Select("SELECT * FROM T_SEC_USER where F_ID=#{id} and F_USER_NAME=#{f_name}")
    List<Person> getPerson2(Map<String,Object> map);
	
}
