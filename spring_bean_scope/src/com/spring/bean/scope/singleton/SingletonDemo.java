package com.spring.bean.scope.singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value =  ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonDemo {

}
