package edu.icet.service.impl;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import edu.icet.repository.Studentrepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        studentrepository.save(mapper.map(studentDto, StudentEntity.class));
    }
    @Override
    public void deleteStudent(Integer id) {
        studentrepository.deleteById(id);
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<StudentEntity> studentEntities = studentrepository.findAll();
        List <StudentDto> studentDtos = new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDto studentDto = mapper.map(studentEntity, StudentDto.class);
            studentDtos.add(studentDto);
        });
        return studentDtos;
    }

    @Override
    public StudentDto searchById(Integer id) {
        StudentEntity studentEntity = studentrepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        return mapper.map(studentEntity,StudentDto.class);
    }

    @Override
    public List<StudentDto> searchStudentByName(String name) {
        List<StudentEntity> allByName = studentrepository.findAllByName(name);
        List<StudentDto> studentDtos = new ArrayList<>();
        allByName.forEach(studentEntity -> {
            StudentDto studentDto = mapper.map(studentEntity, StudentDto.class);
            studentDtos.add(studentDto);
        });
        return studentDtos;
    }
}
