package com.Joins_Demo.Join_Demo.Repository;

import com.Joins_Demo.Join_Demo.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
