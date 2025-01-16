package com.beanlifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

          
            if(beanName.equals("laptop"))
            {
            	System.out.println("Bean Post process before initialization : "+beanName);
            }
            
            
            return bean;
		
	}
	

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(beanName.equals("laptop"))
        {
        	System.out.println("Bean Post process after initialization : "+beanName);
        }
		return bean;
	}

}
