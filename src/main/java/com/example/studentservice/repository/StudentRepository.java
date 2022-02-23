package com.example.studentservice.repository;

import com.example.studentservice.model.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class StudentRepository {

    static Map<Long, Student> studentMap = new HashMap<>();

    static {
        Student s1 = new Student();
        s1.setId(10021L);
        s1.setName("Virat Kohli");
        s1.setPhoneNumber("345754576");

        Student s2 = new Student();
        s2.setId(10011L);
        s2.setName("Rohit Sharma");
        s2.setPhoneNumber("9675809467");

        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);
    }

    public Student getStudentById(Long id) {
        return studentMap.get(id);
    }

    public List<Student> getAllStudents() {
        return studentMap.values().stream().collect(Collectors.toList());
    }
}
