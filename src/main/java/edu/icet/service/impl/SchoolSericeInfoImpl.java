package edu.icet.service.impl;

import edu.icet.dto.SchoolDto;
import edu.icet.entity.SchoolEntity;
import edu.icet.repository.SchoolRepository;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolSericeInfoImpl implements SchoolService {

    final SchoolRepository repository;

    final ModelMapper mapper;

    @Override
    public void addSchool(SchoolDto schoolDto) {
        SchoolEntity schoolEntity = mapper.map(schoolDto, SchoolEntity.class);
        repository.save(schoolEntity);
    }

    @Override
    public void updateSchool(SchoolDto schoolDto) {
        repository.save(mapper.map(schoolDto,SchoolEntity.class));
    }

    @Override
    public void deleteschool(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<SchoolDto> getSchools() {
        List<SchoolEntity> schoolEntities = repository.findAll();
        List <SchoolDto> schoolDtos = new ArrayList<>();
        schoolEntities.forEach(schoolEntity -> {
            SchoolDto schoolDto = mapper.map(schoolEntity, SchoolDto.class);
            schoolDtos.add(schoolDto);
        });
        return schoolDtos;
    }

    @Override
    public SchoolDto searchByID(Integer id) {
        SchoolEntity schoolEntity = repository.findById(id).orElseThrow(() -> new RuntimeException("School not found"));
        return mapper.map(schoolEntity,SchoolDto.class);
    }
}
