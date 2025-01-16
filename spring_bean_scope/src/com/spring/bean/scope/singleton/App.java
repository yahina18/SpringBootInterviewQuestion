package com.spring.bean.scope.singleton;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App { 
	public static void main(String[] args) throws BeansException {

          ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
          ScopeTest Obj1 =   context.getBean("scopeTest",ScopeTest.class);
          ScopeTest Obj2 = context.getBean("scopeTest",ScopeTest.class);
          
          System.out.println(Obj1 +" "+Obj2);
          
          
          ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
          ScopeTest Obj3 =   context1.getBean("scopeTest",ScopeTest.class);
          ScopeTest Obj4 = context1.getBean("scopeTest",ScopeTest.class);
          
		 System.out.println(Obj3 + " "+ Obj4);
          
          
          /*
			 * System.out.println(schoolObj.getStudent());
			 * System.out.println(schoolObj.getStudent());
			 */
          
			/*
			 * stdobj.setName("Ashutosh");
			 * System.out.println(" Get Student Name : "+stdobj.getName());
			 * 
			 * 
			 * Student stdobj2 = context.getBean("student",Student.class);
			 * //stdobj.setName("Ashutosh");
			 * System.out.println(" Get Student Name : "+stdobj2.getName());
			 */
          
          
			/*
			 * PrototypeDemo obj1 = context.getBean("prototypeDemo",PrototypeDemo.class);
			 * PrototypeDemo obj2 = context.getBean("prototypeDemo",PrototypeDemo.class);
			 * 
			 * if(obj1 == obj2) System.out.println("Both objects are same !! "); else
			 * System.out.println("Both objects are different ");
			 */
          
          
          
			/*
			 * SingletonDemo obj1 = context.getBean("singletonDemo",SingletonDemo.class);
			 * SingletonDemo obj2 = context.getBean("singletonDemo",SingletonDemo.class);
			 * 
			 * System.out.println(obj1 +" "+obj2); if(obj1 == obj2)
			 * System.out.println("Both are equal !!! ");
			 */
          
          
          

	}

}
