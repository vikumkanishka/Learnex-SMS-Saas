package edu.icet.service.impl;

import edu.icet.dto.ClassDto;
import edu.icet.entity.ClassEntity;
import edu.icet.repository.ClassRepository;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    final ClassRepository repository;
    final ModelMapper mapper;

    @Override
    public void addClass(ClassDto classDto) {
        ClassEntity classEntity = mapper.map(classDto, ClassEntity.class);
        repository.save(classEntity);
    }

    @Override
    public void updateClass(ClassDto classDto) {
        repository.save(mapper.map(classDto, ClassEntity.class));
    }

    @Override
    public void deleteClass(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ClassDto searchById(Integer id) {
        ClassEntity classEntity = repository.findById(id).orElseThrow(() -> new RuntimeException("Class not found"));
        return mapper.map(classEntity, ClassDto.class);
    }

    @Override
    public List<ClassDto> getAllClasses() {
        List<ClassEntity> classEntities = repository.findAll();
        List <ClassDto> classDtos = new ArrayList<>();
        classEntities.forEach(classEntity -> {
            ClassDto classDto = mapper.map(classEntity, ClassDto.class);
            classDtos.add(classDto);
        });
        return classDtos;
    }

    @Override
    public List<ClassDto> searchClassByName(String name) {
        List<ClassEntity> allByName = repository.findAllByName(name);
        List<ClassDto> classDtos = new ArrayList<>();
        allByName.forEach(classEntity -> {
            ClassDto classDto = mapper.map(classEntity, ClassDto.class);
            classDtos.add(classDto);
        });
        return classDtos;
    }
}
