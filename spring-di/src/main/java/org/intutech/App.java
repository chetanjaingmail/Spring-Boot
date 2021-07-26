package org.intutech;
import org.intutech.bean.Employee;
import org.intutech.bean.Project;
import org.intutech.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-di.xml");
    	Employee e = ctx.getBean("emp", Employee.class);
    	System.out.println("Employee Id : "+ e.getId());
    	System.out.println("Employee Name : "+ e.getName());
    	System.out.println("Employee City : "+ e.getAdd().getCity());
    	System.out.println("Employee Pincode : "+ e.getAdd().getPincode());
    	System.out.println("Employee State : "+ e.getAdd().getState());
    	
    	System.out.println("===================================================");
    	
    	Student stud = ctx.getBean("stud", Student.class);
    	System.out.println("Student Id : "+ stud.getId());
    	System.out.println("Student Name : "+ stud.getName());
    	System.out.println("Student Projects : ");
    	for(Project p : stud.getProjects()) {
    		System.out.println("Project Title : " + p.getTitle());
    		System.out.println("Project Language : " + p.getLanguage());
    		System.out.println("--------------------");
    	}
    	
    	
    	
    }
}
