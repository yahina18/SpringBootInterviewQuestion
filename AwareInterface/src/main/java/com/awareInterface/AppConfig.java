package com.awareInterface;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan
public class AppConfig {
	
	
	@Bean(name = "sachin")
	public Player player1()
	{
		return new Player();
	}
	
	@Bean(name ="virat")
	public Player player2()
	{
		return new Player();
	}

	@Bean
	public MessageSource messageSource()
	{
		ResourceBundleMessageSource mSource = new ResourceBundleMessageSource();
		mSource.setBasename("greet");
		
		return mSource;
		
	}
	
	
	
}
