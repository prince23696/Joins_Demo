package com.Joins_Demo.Join_Demo.Service;

import com.Joins_Demo.Join_Demo.Entity.Course;

import java.util.List;

public interface CourseService {
    
    public List<Course> getAllCourse();

    public Course getCourse(int id);

    public String addCourse(Course course);

    public Course updateCourse(int id, Course course);

    public String deleteCourse(int id);

}
