package edu.icet.repository;

import edu.icet.dto.StudentDto;
import edu.icet.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Studentrepository extends JpaRepository<StudentEntity,Integer> {
    public List<StudentEntity> findAllByName(String name);
}
