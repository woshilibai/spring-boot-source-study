package com.example.springbootmytest;

import com.abc.annotation.EnableCustomerConfiguration;
import com.abc.service.HelloService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootMytestApplicationTests {

	//	自定义starter的bean
	@Autowired
	HelloService helloService;
	
	@Test
	void contextLoads() {
		System.out.println(helloService.toString());
	}

}
