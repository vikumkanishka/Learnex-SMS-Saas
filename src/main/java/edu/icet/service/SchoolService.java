package edu.icet.service;

import edu.icet.dto.SchoolDto;

import java.util.List;

public interface SchoolService {

    void addSchool(SchoolDto schoolDto);

    void updateSchool(SchoolDto schoolDto);

    void deleteschool(Integer id);

    public List<SchoolDto> getSchools();

    public SchoolDto searchByID(Integer integer);
}
