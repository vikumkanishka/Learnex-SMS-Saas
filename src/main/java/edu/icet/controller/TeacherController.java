package edu.icet.controller;

import edu.icet.dto.TeacherDto;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name ="/Teacher")
@RequiredArgsConstructor

public class TeacherController implements TeacherService {

    final TeacherService service;

    @PostMapping("/add-teacher")
    public void addTeacher(@RequestBody TeacherDto teacherDto) {
        service.addTeacher(teacherDto);
    }

    @PutMapping("/update-teacher")
    public void updateTeacher(@RequestBody TeacherDto teacherDto) {
        service.updateTeacher(teacherDto);
    }

    @DeleteMapping("/delete-teacher/{id}")
    public void deleteTeacher(@PathVariable Integer id) {
        service.deleteTeacher(id);
    }

    @GetMapping("/get-all-teachers")
    public List<TeacherDto> getallTeachers() {
        return service.getallTeachers();
    }

    @GetMapping("/search-teacher-by-id/{id}")
    public TeacherDto searchTeacherById(@PathVariable Integer id) {
        return service.searchTeacherById(id);
    }

    @GetMapping("/search-teacher-by-name/{name}")
    public List<TeacherDto> serachTeacherByname(@PathVariable String name) {
        return service.serachTeacherByname(name);
    }
}
