package com.beanlifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcess implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        String[] beanDefinition =  beanFactory.getBeanDefinitionNames();
       
        for(String bean : beanDefinition) {
            
            if(bean.equals("laptop"))
            {
            	System.out.println("Bean postProcessBeanFactory method called for : "+bean);
            }
        	
			/*
			 * if(bean.equals("laptop")) { BeanDefinition obj =
			 * beanFactory.getBeanDefinition(bean);
			 * obj.setScope(BeanDefinition.SCOPE_PROTOTYPE); }
			 * 
			 * System.out.println(beanFactory.getBeanDefinition(bean));
			 */
        	
        }
        	
		
		
	}

}
