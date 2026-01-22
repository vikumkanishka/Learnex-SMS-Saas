package edu.icet.controller;

import edu.icet.dto.SchoolDto;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/school")

public class SchoolController {

    final SchoolService service;

    @PostMapping("/add-school")
    public void addSchool(@RequestBody SchoolDto schoolDto){
        service.addSchool(schoolDto);
    }
    @PutMapping("/update-school")
    public void updateSchool(@RequestBody SchoolDto schoolDto) {
        service.updateSchool(schoolDto);
    }
    @DeleteMapping("/delete-school/{id}")
    public void deleteschool(@PathVariable Integer id) {
        service.deleteschool(id);
    }
    @GetMapping("/get-schools")
    public List<SchoolDto> getSchools() {
        return service.getSchools();
    }
    @GetMapping("search-by-id/{id}")
    public SchoolDto searchByID(@PathVariable Integer id) {
        return service.searchByID(id);
    }
}
