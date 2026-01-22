package edu.icet.service.impl;

import edu.icet.dto.SchoolDto;
import edu.icet.repository.SchoolRepository;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolSericeInfoImpl implements SchoolService {

    final SchoolRepository repository;

    @Override
    public void addSchool(SchoolDto schoolDto) {
        repository.save(schoolDto);

    }
    @Override
    public void updateSchool(SchoolDto schoolDto) {
        repository.save(schoolDto);
    }

    @Override
    public void deleteschool(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<SchoolDto> getSchools() {
        return repository.findAll();
    }
    @Override
    public SchoolDto searchByID(Integer id) {
        return repository.findById(id).get();
    }
}
