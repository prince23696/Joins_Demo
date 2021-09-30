package com.Joins_Demo.Join_Demo.Repository;

import com.Joins_Demo.Join_Demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
