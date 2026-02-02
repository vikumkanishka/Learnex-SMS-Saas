package edu.icet.service.impl;

import edu.icet.dto.ClassDto;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    final ClassService service;

    @Override
    public void addClass(ClassDto classDto) {
        service.addClass(classDto);
    }

    @Override
    public void updateClass(ClassDto classDto) {
        service.updateClass(classDto);
    }

    @Override
    public void deleteClass(Integer id) {
        service.deleteClass(id);
    }

    @Override
    public ClassDto searchById(Integer id) {
        return service.searchById(id);
    }

    @Override
    public List<ClassDto> getAllClasses() {
        return service.getAllClasses();
    }

    @Override
    public List<ClassDto> searchClassByName(String name) {
        return service.searchClassByName(name);
    }
}
