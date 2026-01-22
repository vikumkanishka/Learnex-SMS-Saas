package edu.icet.repository;

import edu.icet.dto.SchoolDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<SchoolDto,Integer> {
}
