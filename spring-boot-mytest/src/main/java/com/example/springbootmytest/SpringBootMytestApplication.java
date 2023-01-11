package com.example.springbootmytest;

import com.abc.annotation.EnableCustomerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCustomerConfiguration	//	是否对自定义starter的bean进行自动配置的开关注解
@SpringBootApplication
public class SpringBootMytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMytestApplication.class, args);
	}

}
