package com.aires.springbootMyBatis.controller;

import javax.annotation.Resource;

import com.aires.springbootMyBatis.entity.City;
import com.aires.springbootMyBatis.mapper.CityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
@EnableAutoConfiguration
public class HelloController {
	protected static Logger logger= LoggerFactory.getLogger(HelloController.class);
	@Resource
	private CityMapper cityMapper;
	@RequestMapping("/test")
	String test1(){
		return "hello,test1()";
	}
	@RequestMapping("/findCity2")

	City findCity2(@RequestParam String id){
		logger.debug("Log test, the test log level is debug .");
		return cityMapper.findCityById(id);
	}
}

