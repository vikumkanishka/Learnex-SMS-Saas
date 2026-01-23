package edu.icet.controller;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")

public class StudentController {

    final StudentService service;

    @PostMapping("/add-student")
    public void addStudent(@RequestBody StudentDto studentDto) {
        service.addStudent(studentDto);
    }

    @PutMapping("/update-student")
    public void updateStudent(@RequestBody StudentDto studentDto) {
        service.updateStudent(studentDto);
    }

    @DeleteMapping("/delete-student/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        service.deleteStudent(id);
    }

    @GetMapping("/get-all-students")
    public List<StudentDto> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/search-by-id/{id}")
    public StudentDto searchById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/search-by-name/{name}")
    public List<StudentDto> searchStudentByName(@PathVariable String name) {
        return service.searchStudentByName(name);
    }
}
