package com.beanlifeCycle;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Battery  {

	public Battery() {
       
		System.out.println("Battery get initialized !! ");

	}
	
	public void charger()
	{
		System.out.println("Battery get charged !! ");
	}
	
	@PreDestroy
	public void destory()
	{
		System.out.println("Destory Method called via PreDestory Method : ");
	}
}
