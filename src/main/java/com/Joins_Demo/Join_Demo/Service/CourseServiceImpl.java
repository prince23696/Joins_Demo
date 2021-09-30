package com.Joins_Demo.Join_Demo.Service;

import com.Joins_Demo.Join_Demo.Entity.Course;
import com.Joins_Demo.Join_Demo.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourse() {
        List<Course> courses = courseRepository.findAll();
        return courses;
    }

    @Override
    public Course getCourse(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public String addCourse(Course course) {
        courseRepository.save(course);
        return "Course Added Successfully";
    }

    @Override
    public Course updateCourse(int id, Course course) {
        Course course1 = courseRepository.findById(id).get();
        course1.setCname(course.getCname());
        course1.setDuration(course.getDuration());
        course1.setFee(course.getFee());
        course1.setStudentList(course.getStudentList());
        courseRepository.save(course1);
        return course1;
    }

    @Override
    public String deleteCourse(int id) {
        courseRepository.deleteById(id);
        return "Course Deleted Successfully";
    }
}
