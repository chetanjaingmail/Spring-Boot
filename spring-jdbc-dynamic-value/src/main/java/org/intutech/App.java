package org.intutech;

import org.intutech.bean.Question;
import org.intutech.service.QuestionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Question q1 = new Question();
    	q1.setId(1);
    	q1.setTitle("What is JSE?");
    	q1.setQuesdesc("I wants to know about JSE in details...");
    	q1.setPostedon("2021-06-16");
    	
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
    	
        QuestionService service = ctx.getBean("quesService", QuestionService.class);
    	
    	service.saveQuestion(q1);
        //service.updateQuestion(q1);
    	//service.getQuestion();
        //service.getQuestionsByRowMapper();
    	
    	
    }
}
