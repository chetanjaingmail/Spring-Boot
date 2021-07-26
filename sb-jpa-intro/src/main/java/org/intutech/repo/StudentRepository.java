package org.intutech.repo;

import org.intutech.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "studRepo")
public interface StudentRepository extends JpaRepository<Student, String> {
}
