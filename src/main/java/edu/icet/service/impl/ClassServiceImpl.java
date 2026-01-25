package edu.icet.service.impl;

import edu.icet.dto.ClassDto;
import edu.icet.service.ClassService;

import java.util.List;

public class ClassServiceImpl implements ClassService {
    @Override
    public void addClass(ClassDto classDto) {

    }

    @Override
    public void updateClass(ClassDto classDto) {

    }

    @Override
    public void deleteClass(Integer id) {

    }

    @Override
    public ClassDto searchById(Integer id) {
        return null;
    }

    @Override
    public List<ClassDto> getAllClasses() {
        return List.of();
    }

    @Override
    public List<ClassDto> searchClassByName(String name) {
        return List.of();
    }
}
