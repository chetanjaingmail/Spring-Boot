package org.intutech;

import org.intutech.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student s1 = ctx.getBean("stud", Student.class);
        Student s2 = ctx.getBean("stud", Student.class);
        Student s3 = ctx.getBean("stud", Student.class);
        Student s4 = ctx.getBean("stud", Student.class);
        Student s5 = ctx.getBean("stud", Student.class);
    }
}
