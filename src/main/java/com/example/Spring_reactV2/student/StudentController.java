package com.example.Spring_reactV2.student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(1L, "Aaron", "ngkalun149@gmail.com", Gender.MALE ),
                new Student(2L, "Alex", "Alex149@gmail.com", Gender.MALE ),
                new Student(3L, "Kitty", "Kitty149@gmail.com", Gender.FEMALE ),
                new Student(4L, "Sam", "Sam149@gmail.com", Gender.MALE )
        );
        return students;
    }
}
