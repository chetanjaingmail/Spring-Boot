package org.intutech;

import org.intutech.service.QuestionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
    	QuestionService qs = ctx.getBean("quesService", QuestionService.class);
    	//qs.save();
    	//qs.update();
    	//qs.get();
    	qs.delete();
    }
}
