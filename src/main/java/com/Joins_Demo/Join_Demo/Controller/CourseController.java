package com.Joins_Demo.Join_Demo.Controller;

import com.Joins_Demo.Join_Demo.Entity.Course;
import com.Joins_Demo.Join_Demo.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("getCourse/{id}")
    public Course getCourse(@PathVariable int id) {
        Course Course = courseService.getCourse(id);
        return Course;
    }

    @GetMapping("/getCourses")
    public List<Course> getAllCourse() {
        return (List<Course>) courseService.getAllCourse();
    }

    @PostMapping("/saveCourse")
    public Course addCourse(@RequestBody Course Course) {
        courseService.addCourse(Course);
        return Course;
    }

    @DeleteMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(id);
        return "deleted form database id=" + id;
    }

    @PutMapping("/updateCourse/{id}")
    public Course updateCourse(@PathVariable int id, @RequestBody Course Course) {
        courseService.updateCourse(id, Course);
        return Course;
    }
}