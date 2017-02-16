package com.aires.springbootMyBatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan    //扫描Servlet
@MapperScan("com.aires.springbootMyBatis.mapper")
public class SpringBootMyBatisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyBatisProjectApplication.class, args);
	}
}
