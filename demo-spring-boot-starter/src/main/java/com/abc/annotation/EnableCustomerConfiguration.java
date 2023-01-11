package com.abc.annotation;

import com.abc.config.ConfigMarker;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 开关注解，实现自定义starter配置类的热插拔，启动类加上该注解，则启用并进行自动配置。
 * @Author tianwl
 * @Company 安徽中科美络信息技术有限公司
 * @Email tianwl@izkml.com
 * @Date 2023/1/9 16:08
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(ConfigMarker.class)	//	向容器中注入bean
public @interface EnableCustomerConfiguration {
}
