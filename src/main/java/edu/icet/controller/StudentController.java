package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @PostMapping
    public void addStudent(StudentDto studentDto) {

    }

    @PutMapping
    public void updateStudent(StudentDto studentDto) {

    }

    @DeleteMapping
    public void deleteStudent(Integer id) {

    }

    @GetMapping
    public List<StudentDto> getAllStudents() {
        return List.of();
    }

    @GetMapping
    public StudentDto searchById(Integer id) {
        return null;
    }

    @GetMapping
    public List<StudentDto> searchStudentByName(String name) {
        return List.of();
    }
}
