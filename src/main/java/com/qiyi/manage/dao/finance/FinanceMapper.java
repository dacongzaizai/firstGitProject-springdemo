package com.qiyi.manage.dao.finance;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.qiyi.manage.entity.User;

@Mapper
public interface FinanceMapper {

	@Select("SELECT * FROM T_SEC_USER")
    List<User> getFUser();
}
