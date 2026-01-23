package edu.icet.service;

import edu.icet.dto.StudentDto;

import java.util.List;

public interface StudentService {

    void addStudent(StudentDto studentDto);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Integer id);

    public List<StudentDto> getAllStudents();

    public StudentDto searchById(Integer id);

    public List<StudentDto> searchStudentByName (String name);

}
