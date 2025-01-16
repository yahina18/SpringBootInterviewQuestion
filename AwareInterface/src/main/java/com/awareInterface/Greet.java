package com.awareInterface;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class Greet implements MessageSourceAware {

	@Override
	public void setMessageSource(MessageSource messageSource) {

           String message =  messageSource.getMessage("greet", null,Locale.US);
		   System.out.println("Message : "+message);
	}

}
