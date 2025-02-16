package com.decay.aop.aopexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopexamApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopexamApplication.class, args);
	}

}
