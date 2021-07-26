package org.intutech;

import java.util.List;

import org.intutech.bean.Student;
import org.intutech.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbJpaQueryExecutionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SbJpaQueryExecutionApplication.class, args);
	
		StudentRepo repo = ctx.getBean("studRepo",StudentRepo.class);
		
		// id = 6
		
		//Student stud = repo.findById(6).get(); 
		//Student stud = repo.findByName("C");
		//Student stud = repo.findByEmail("a@gmail.com");
		//List<Student> studs = repo.findByGender("Female");
		List<Student> studs = repo.findByAgeBetween(18,20);
		
		for(Student stud : studs){
			System.out.println("Id : "+stud.getId());
			System.out.println("Name : "+stud.getName());
			System.out.println("Email : "+stud.getEmail());
			System.out.println("Gender : "+stud.getGender());
			System.out.println("Age : "+stud.getAge());
			System.out.println("=============================");
		}
		
		System.out.println("Operation Success...");
	
	}

}
