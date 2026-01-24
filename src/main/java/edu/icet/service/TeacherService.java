package edu.icet.service;

import edu.icet.dto.TeacherDto;

import java.util.List;

public interface TeacherService {

    void addTeacher(TeacherDto teacherDto);

    void updateTeacher(TeacherDto teacherDto);

    void deleteTeacher(Integer id);

    public List<TeacherDto> getallTeachers();

    public TeacherDto searchTeacherById(Integer id);

    public List<TeacherDto> serachTeacherByname(String name);
}
