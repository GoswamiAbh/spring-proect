package com.abhi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhi.beans.Engine;

@Configuration
@ComponentScan(basePackages="com.abhi")
public class AppConfig {
	
    @Bean
    //isse apan khud obj bna kr engine obj ko call kr sakte hai 
	public Engine  getEngine() {
	Engine e=new Engine();
		//logic
		return e;
	}

}
