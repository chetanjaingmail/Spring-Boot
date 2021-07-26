package org.intutech;

import org.intutech.bean.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbIntroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbIntroApplication.class, args);
		Employee e = (Employee) context.getBean("employee");
		e.test();
	}

}
