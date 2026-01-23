package edu.icet.repository;

import edu.icet.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<StudentEntity,Integer> {
}
