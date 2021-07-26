package org.intutech;

import org.intutech.bean.Employee;
import org.intutech.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-si.xml","spring-ci.xml");
      		Employee e = ctx.getBean("emp",Employee.class);
      		System.out.println("Id : "+e.getId());
      		System.out.println("Name : "+e.getName());
      		System.out.println("Email : "+e.getEmail());
      		System.out.println("Salary : "+e.getSalary());
      		System.out.println("Address : "+ e.getAddress());
      		System.out.println("Skills : "+ e.getSkills());
      		System.out.println("Projects : "+ e.getProjects());
      		System.out.println("Contact : ");
      		for(String s : e.getContact()) {
      			System.out.println(s);
      		}
      		
      		System.out.println("Active Flag : "+ e.isActiveFlag());
      		
      		System.out.println("=======================================");
      		
      		Student st = ctx.getBean("stud", Student.class);
      		System.out.println("Id : "+st.getId());
      		System.out.println("Name : "+st.getName());
      		System.out.println("Higher Edu. : "+st.getHigherEdu());
      		
      		System.out.println("Contact : ");
      		for(String c : st.getContact()) {
      			System.out.println(c);
      		}
      		System.out.println("Skills : "+st.getSkills());
      		System.out.println("Address : "+st.getAddress());
      		
      		
    }
}
