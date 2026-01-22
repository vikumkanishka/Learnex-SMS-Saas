package edu.icet.service;

import edu.icet.dto.SchoolDto;

import java.util.List;

public interface SchoolService {

    void addStudent(SchoolDto schoolDto);

    void updateSudent(SchoolDto schoolDto);

    void deleteStudent(Integer id);

    public List<SchoolDto> getSchools();

    public SchoolDto searchByID(Integer integer);
}
