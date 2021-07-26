package org.intutech;

import java.util.ArrayList;
import java.util.List;

import org.intutech.bean.Student;
import org.intutech.repo.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbJpaIntroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SbJpaIntroApplication.class, args);
		StudentRepository stuRepo = ctx.getBean("studRepo", StudentRepository.class);
		
		Student st1 = new Student();
		st1.setName("Test2");
		st1.setEmail("Test2@gmail.com");
		st1.setContact("6655668750");
		st1.setGender("Male");
		
		Student st2 = new Student();
		st2.setName("Test3");
		st2.setEmail("Test3@gmail.com");
		st2.setContact("6521021547");
		st2.setGender("Male");
		
		ArrayList<Student> list = new ArrayList();
		list.add(st1);
		list.add(st2);
		
		//stuRepo.save(st1);
		//stuRepo.saveAll(list);
		
		//stuRepo.delete(st1);
		
		List<Student> studList = stuRepo.findAll();
		for(Student s : studList) {
			System.out.println(s.getEmail());
			System.out.println(s.getName());
			System.out.println(s.getContact());
			System.out.println(s.getGender());
			System.out.println("================================");
		}
		
		Student s = stuRepo.findById("Test3@gmail.com").get();
		System.out.println("================================");
		System.out.println(s.getEmail());
		System.out.println(s.getName());
		System.out.println(s.getContact());
		System.out.println(s.getGender());
		System.out.println("================================");
		
	}

}
