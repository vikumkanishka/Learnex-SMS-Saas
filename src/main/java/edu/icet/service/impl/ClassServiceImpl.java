package edu.icet.service.impl;

import edu.icet.dto.ClassDto;
import edu.icet.repository.ClassRepository;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    final ClassRepository service;
    final ModelMapper mapper;

    @Override
    public void addClass(ClassDto classDto) {
        service.save(classDto);
    }

    @Override
    public void updateClass(ClassDto classDto) {
        service.save(classDto);
    }

    @Override
    public void deleteClass(Integer id) {
        service.deleteById(id);
    }

    @Override
    public ClassDto searchById(Integer id) {
        return service.findById(id);
    }

    @Override
    public List<ClassDto> getAllClasses() {
        return service.findAll();
    }

    @Override
    public List<ClassDto> searchClassByName(String name) {
        return service.findAllByName(name);
    }
}
