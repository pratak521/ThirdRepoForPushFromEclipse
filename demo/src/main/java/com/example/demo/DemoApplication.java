package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.pat.HelloWorld;

import configuration.HelloWorldConfig;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context =new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld bean = (HelloWorld) context.getBean("helloWorlBean");
		bean.sayHelloWorld("This is Pravin ");
	//	SpringApplication.run(DemoApplication.class, args);
		context.close();
	}

}
