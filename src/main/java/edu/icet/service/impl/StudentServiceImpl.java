package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.Studentrepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final Studentrepository studentrepository;
    final ModelMapper mapper;

    @Override
    public void addStudent(StudentDto studentDto) {
        StudentEntity studentEntity = mapper.map(studentDto, StudentEntity.class);
        studentrepository.save(studentEntity);
    }

    @Override
    public void updateStudent(StudentDto studentDto) {

    }

    @Override
    public void deleteStudent(Integer id) {
        studentrepository.deleteById(id);
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
