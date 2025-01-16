package com.awareInterface;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class Player implements BeanNameAware,ApplicationContextAware {
	
	
	ApplicationContext applicationContext;
	
	public Player() {

		System.out.println("Player object created !! ");
         
	}
	
	 private Game game;
	
	@Override
	public void setBeanName(String name) {
	
		System.out.println("Player Name : "+name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

          //this.applicationContext = applicationContext;
           game  =   applicationContext.getBean(Game.class);
		
	}
	
	public void play()
	{
		game.gamePlay();
	}
}
