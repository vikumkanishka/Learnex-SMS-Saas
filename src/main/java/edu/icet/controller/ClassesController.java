package edu.icet.controller;

import edu.icet.dto.ClassDto;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "classes")
@RequiredArgsConstructor
public class ClassesController implements ClassService{

    final ClassService service;

    @PostMapping("/add-class")
    public void addClass(@RequestBody ClassDto classDto) {
        service.addClass(classDto);
    }

    @PutMapping("/update-class")
    public void updateClass(@RequestBody ClassDto classDto) {
        service.updateClass(classDto);
    }

    @DeleteMapping("/delete-class/{id}")
    public void deleteClass(@PathVariable Integer id) {
        service.deleteClass(id);
    }

    @GetMapping("/search-by-id/{id}")
    public ClassDto searchById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/get-all-classes")
    public List<ClassDto> getAllClasses() {
        return service.getAllClasses();
    }

    @GetMapping("/search-by-name/{name}")
    public List<ClassDto> searchClassByName(@PathVariable String name) {
        return service.searchClassByName(name);
    }
}
