package org.intutech.repository;

import java.util.List;

import org.intutech.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "studRepo")
public interface StudentRepo extends JpaRepository<Student, Integer> {
	public Student findByName(String name); 
	public Student findByEmail(String email);
	public List<Student> findByGender(String gen);
	public List<Student> findByAgeBetween(int startAge, int endAge);
}
