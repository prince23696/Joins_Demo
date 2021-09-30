package com.Joins_Demo.Join_Demo.Service;

import com.Joins_Demo.Join_Demo.Entity.Student;
import com.Joins_Demo.Join_Demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student Added";
    }

    @Override
    public Student updateStudent(int id, Student student) {
        Student student1 = studentRepository.findById(id).get();
        student1.setName(student.getName());
        student1.setSub(student.getSub());
        student1.setResult(student.getResult());
        student1.setCourse(student.getCourse());
        studentRepository.save(student1);
        return student1;
    }

    @Override
    public String deleteStudent(int id) {
        studentRepository.deleteById(id);
        return "Student Deleted";
    }
}
