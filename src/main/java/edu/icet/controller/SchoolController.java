package edu.icet.controller;

import edu.icet.dto.SchoolDto;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SchoolController {

    final SchoolService service;

    @PostMapping("/add-school")
    public void addSchool(SchoolDto schoolDto){
        service.addSchool(schoolDto);
    }


}
