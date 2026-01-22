package edu.icet.service.impl;

import edu.icet.dto.SchoolDto;
import edu.icet.repository.StudentRepository;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolSericeInfoImpl implements SchoolService {

    final StudentRepository repository;


    @Override
    public void addStudent(SchoolDto schoolDto) {

    }

    @Override
    public void updateSudent(SchoolDto schoolDto) {

    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public List<SchoolDto> getSchools() {
        return List.of();
    }

    @Override
    public SchoolDto searchByID(Integer integer) {
        return null;
    }
}
