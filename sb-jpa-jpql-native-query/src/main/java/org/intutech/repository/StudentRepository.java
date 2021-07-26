package org.intutech.repository;

import java.util.List;

import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;

import org.intutech.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	@Query(value = "From Student where gender=?1")
	public List<Student> getStudentsUsingGender(String gender);
	
	@Query(value = "select * from studdetails where studgender=?1", nativeQuery = true)
	public List<Student> getStudentsUsingGenderBySQL(String gender);
	
	public List<Student> getStudentUsingAge(int age);
	
	public List<Object> getStudentUsingAgeBySql(int age);
	
	@Modifying
	@Query(value = "update Student set gender=?1 where id=?2")
	public Student updateStudentsGender(String gender, int id);
	
}
