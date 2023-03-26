package com.example.book.Service;

import com.example.book.DTO.StudentDTO;
import com.example.book.Model.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAll();
    public Student getStudentById(Long id);
    public StudentDTO createStudent(Student student);
    public void deleteStudentById(Long id);
}
