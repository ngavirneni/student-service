package com.example.studentservice.controller;

import com.example.studentservice.model.Student;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/{id}")
    public Student getStudent(@PathVariable Long id) throws Exception{
        return studentService.getStudent(id);
    }

    @GetMapping(path = "/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
