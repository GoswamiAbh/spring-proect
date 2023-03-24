package com.abhi.appTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhi.config.AppConfig;

public class AppTest {
	public static void main(String[] args) {
		ApplicationContext cxt= new AnnotationConfigApplicationContext(AppConfig.class);
		
	
	}
}