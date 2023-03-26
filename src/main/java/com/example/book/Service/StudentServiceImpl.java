package com.example.book.Service;

import com.example.book.DTO.StudentDTO;
import com.example.book.Model.Student;
import com.example.book.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.get();
    }

    @Override
    public StudentDTO createStudent(Student student) {
        StudentDTO response = new StudentDTO();
        Student createdStudent = studentRepository.save(student);
        response.setFirstName(createdStudent.getFirstName());
        response.setLastName(createdStudent.getLastName());
        response.setFullName(createdStudent.getFirstName() + createdStudent.getLastName());
        response.setAge(createdStudent.getAge());
        return response;
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
