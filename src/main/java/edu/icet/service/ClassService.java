package edu.icet.service;

import edu.icet.dto.ClassDto;

import java.util.List;

public interface ClassService {
    void addClass(ClassDto classDto);

    void updateClass(ClassDto classDto);

    void deleteClass(Integer id);

    public ClassDto searchById(Integer id);

    public List<ClassDto> getAllClasses();

    public List<ClassDto> searchClassByName(String name);
}
