package com.abc.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Description: todo
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2023/1/9 15:48
 */
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "hello.service")
public class HelloService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloService{" +
				"name='" + name + '\'' +
				'}';
	}
}
