package com.Joins_Demo.Join_Demo.Controller;

import com.Joins_Demo.Join_Demo.Entity.Student;
import com.Joins_Demo.Join_Demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("getStudent/{id}")
    public Student getStudent(@PathVariable int id) {
        Student Student = studentService.getStudent(id);
        return Student;
    }

    @GetMapping("/getStudents")
    public List<Student> getAllStudents() {
        return (List<Student>) studentService.getAllStudent();
    }

    @PostMapping("/saveStudent")
    public Student addStudent(@RequestBody Student Student) {
        studentService.addStudent(Student);
        return Student;
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "deleted form database id=" + id;
    }

    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student Student) {
        studentService.updateStudent(id, Student);
        return Student;
    }
}
