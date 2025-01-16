package com.beanlifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public static CustomBeanFactoryPostProcess customBeanFactoryPostProcess()
	{
		return new CustomBeanFactoryPostProcess();
	}
	
	@Bean
	public static CustomBeanPostProcessor customBeanPostProcess()
	{
		return new CustomBeanPostProcessor();
	}
	
}
