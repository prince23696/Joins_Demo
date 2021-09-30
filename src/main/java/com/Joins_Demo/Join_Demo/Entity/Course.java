package com.Joins_Demo.Join_Demo.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cname;
    private String duration;
    private int fee;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "course")
    private List<Student> studentList;


    public Course() {
    }

    public Course(int id, String cname, String duration, int fee, List<Student> studentList) {
        this.id = id;
        this.cname = cname;
        this.duration = duration;
        this.fee = fee;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", duration='" + duration + '\'' +
                ", fee=" + fee +
                ", studentList=" + studentList +
                '}';
    }
}
