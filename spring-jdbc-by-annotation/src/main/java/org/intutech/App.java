package org.intutech;

import org.intutech.service.QuestionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("org.intutech");
        QuestionService qs = ctx.getBean("questionService", QuestionService.class);
        qs.getQuestions();
    }
}
