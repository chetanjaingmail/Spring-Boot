package org.intutech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 
 create table register(
	id int primary key auto_increment,
	name varchar(20),
	email varchar(30),
	password varchar(16),
	enable tinyint(1),
	role varchar(30)
);

insert into register values(0, 'A', 'a@gmail.com', 'a@123', 1, "ROLE_MANAGER"),
(0, 'B', 'b@gmail.com', 'b@123', 1, "ROLE_MANAGER"),
(0, 'C', 'c@gmail.com', 'c@123', 1, "ROLE_DEVELOPER"),
(0, 'D', 'd@gmail.com', 'd@123', 1, "ROLE_TESTER"),
(0, 'E', 'e@gmail.com', 'e@123', 1, "ROLE_DEVELOPER");
 
 
 
 */



@SpringBootApplication
public class SbSecurityJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbSecurityJdbcApplication.class, args);
	}

}
