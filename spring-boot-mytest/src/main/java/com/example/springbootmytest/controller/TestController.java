package com.example.springbootmytest.controller;

import com.abc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2023/1/4 11:35
 */
@RestController
public class TestController {

//	@Autowired
//	HelloService helloService;

	@RequestMapping("/test")
	public String test(){
//		System.out.println("==========" + helloService.toString());
		return "springboot[V2.2.9.RELEASE]源码环境搭建成功";
	}
}
