package com.example.book.Controller;

import com.example.book.Model.Student;
import com.example.book.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    private List<Student> getAllStudents() {
        return studentService.getAll();
    }

}
