package com.abc.config;

import com.abc.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 自定义的配置工厂类
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2023/1/9 15:48
 */
@Configuration
@ConditionalOnBean(ConfigMarker.class)	//	存在该bean时该配置工厂类才进行自动配置
public class Mycofiguration {

	@Bean
	public HelloService helloService(){
		return new HelloService();
	}
}
