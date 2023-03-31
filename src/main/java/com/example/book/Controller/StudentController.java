package com.example.book.Controller;

import com.example.book.DTO.StudentDTO;
import com.example.book.Model.Student;
import com.example.book.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAll();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable Long studentId) {
        return studentService.getStudentById(studentId);
    }

    @PostMapping("/students")
    public StudentDTO createStudent(@RequestBody Student student) {
        StudentDTO response = studentService.createStudent(student);
        return response;
    }

    @DeleteMapping("/students/{studentId}")
    public StudentDTO deleteStudent(@PathVariable Long studentId) {
        StudentDTO response = studentService.deleteStudentById(studentId);
        return response ;
    }

    @PutMapping("/students/{studentId}")
    public StudentDTO updateStudent(@PathVariable Long studentId, @RequestBody Student student) {
        StudentDTO response = studentService.updateStudentById(studentId, student);
        return response;
    }
}
