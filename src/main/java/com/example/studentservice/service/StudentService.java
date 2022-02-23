package com.example.studentservice.service;

import com.example.studentservice.model.Student;
import com.example.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudent(Long studentId) throws Exception{
        Student student = studentRepository.getStudentById(studentId);

        if(student == null) {
            throw new Exception("Student Not Found");
        }

        return student;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
}
