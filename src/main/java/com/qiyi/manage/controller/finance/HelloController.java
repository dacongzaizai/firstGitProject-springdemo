package com.qiyi.manage.controller.finance;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qiyi.manage.entity.User;
import com.qiyi.manage.service.finance.IUserService;

@RestController
/**
 *
 @Controller表明该类内的所有方法默认返回页面路径，加了@ResponseBody的方法返回数据。
@RestController则是相当于@Controller@ResponseBody两个注解，该类返回的都是数据，不返回页面。
 *
 */
@RequestMapping("/manage")
public class HelloController {
	
	@Autowired
    private IUserService userService;
		@RequestMapping("/hello")
	    public String hello(){
		List<User> list =	userService.getUser();
		for(User user:list) {
			System.out.println(user.getF_user_name()+"----------");
		}
		
		List<User> list1 =	userService.getFUser();
		System.out.println("+++++++++"+list1.get(0).getF_user_name()+"----------");
	     return "Welcome to start SpringBoot!";
	    }
}
