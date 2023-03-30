package com.example.book.Service;

import com.example.book.DTO.StudentDTO;
import com.example.book.Model.Student;
import com.example.book.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

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
    public StudentDTO deleteStudentById(Long id) {
        StudentDTO studentDTO = new StudentDTO();
        Student deletedStudent = studentRepository.findById(id).get();
        studentRepository.deleteById(id);
        studentDTO.setFirstName(deletedStudent.getFirstName());
        studentDTO.setLastName(deletedStudent.getLastName());
        studentDTO.setFullName(deletedStudent.getFirstName() + " " + deletedStudent.getLastName());
        studentDTO.setAge(deletedStudent.getAge());
        return studentDTO;
    }
}
