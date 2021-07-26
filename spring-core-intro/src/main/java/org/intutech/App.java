package org.intutech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Demo d= new Demo();
    	//d.test();
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    	Demo demo = ctx.getBean("d", Demo.class);
    	demo.test();
    	
    }
}
