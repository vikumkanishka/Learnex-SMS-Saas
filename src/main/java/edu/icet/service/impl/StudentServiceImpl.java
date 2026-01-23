package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(StudentDto studentDto) {

    }

    @Override
    public void updateStudent(StudentDto studentDto) {

    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public List<StudentDto> getAllStudents() {
        return List.of();
    }

    @Override
    public StudentDto searchById(Integer id) {
        return null;
    }

    @Override
    public List<StudentDto> searchStudentByName(String name) {
        return List.of();
    }
}
