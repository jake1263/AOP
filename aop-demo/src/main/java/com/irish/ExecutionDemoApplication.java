package com.irish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)/*这个注解是用来选择是CGlib还是选JDK的动态代理*/
public class ExecutionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExecutionDemoApplication.class, args);
	}
}
