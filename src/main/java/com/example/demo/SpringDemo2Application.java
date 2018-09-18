package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.qiyi.*"}) //在注解中，写明需要扫描的包 controller的扫描
@MapperScan(value = "com.qiyi.manage.dao")
public class SpringDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo2Application.class, args);
	}
}
