package com.aop;

import java.util.ArrayList;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		
		ArrayList<String>list=null;
		
		if(CollectionUtils.isNotEmpty(list)){
			System.out.println("Yes"+list.size());
		}else{
			System.out.println("NO");
		}
		
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}