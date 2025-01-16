package com.beanlifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements DisposableBean {
	
	Battery battery;
	
	public Laptop()
	{
		System.out.println("Laptop get initialized !!");
	}
	
	public Battery getBattery() {
		return battery;
	}

	@Autowired
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public void getCharger()
	{
		battery.charger();
	}

	@Override
	public void destroy() throws Exception {

        System.out.println("Destory Method called !! ");
		
	}

}
