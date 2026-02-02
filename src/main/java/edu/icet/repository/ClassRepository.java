package edu.icet.repository;

import edu.icet.dto.ClassDto;
import edu.icet.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassRepository extends JpaRepository<ClassEntity, Integer> {
    List<ClassDto> findAllByName(String name);
}
