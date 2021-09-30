package com.Joins_Demo.Join_Demo.Service;

import com.Joins_Demo.Join_Demo.Entity.Student;

import java.util.List;

public interface StudentService {
    
    public List<Student> getAllStudent();

    public Student getStudent(int id);

    public String addStudent(Student student);

    public Student updateStudent(int id, Student student);

    public String deleteStudent(int id);
}
