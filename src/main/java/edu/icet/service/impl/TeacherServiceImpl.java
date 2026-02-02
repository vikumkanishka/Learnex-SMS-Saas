package edu.icet.service.impl;

import edu.icet.dto.TeacherDto;
import edu.icet.entity.TeacherEntity;
import edu.icet.repository.TeacherRepository;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class TeacherServiceImpl implements TeacherService {

    final TeacherRepository repository;
    final ModelMapper mapper;

    @Override
    public void addTeacher(TeacherDto teacherDto) {
        TeacherEntity teacherEntity = mapper.map(teacherDto, TeacherEntity.class);
        repository.save(teacherEntity);
    }

    @Override
    public void updateTeacher(TeacherDto teacherDto) {
        repository.save(mapper.map(teacherDto, TeacherEntity.class));
    }

    @Override
    public void deleteTeacher(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<TeacherDto> getallTeachers() {
        List<TeacherEntity> teacherEntities = repository.findAll();
        List<TeacherDto> teacherDtos = new ArrayList<>();
        teacherEntities.forEach(teacherEntity -> {
            TeacherDto teacherDto = mapper.map(teacherEntity, TeacherDto.class);
            teacherDtos.add(teacherDto);
        });
        return teacherDtos;
    }

    @Override
    public TeacherDto searchTeacherById(Integer id) {
        TeacherEntity teacherEntity = repository.findById(id).orElseThrow(() -> new RuntimeException("Teacher not found"));
        return mapper.map(teacherEntity,TeacherDto.class);
    }

    @Override
    public List<TeacherDto> serachTeacherByname(String name) {
        List<TeacherEntity> teacherDtoList = repository.findByName(name);
        List<TeacherDto> teacherDtos =new ArrayList<>();
        teacherDtoList.forEach(teacherEntity -> {
            TeacherDto teacherDto = mapper.map(teacherEntity, TeacherDto.class);
            teacherDtos.add(teacherDto);
        });
        return teacherDtos;
    }
}
