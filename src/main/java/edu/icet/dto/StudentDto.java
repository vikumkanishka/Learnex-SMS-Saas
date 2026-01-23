package edu.icet.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class StudentDto {
    private Integer id;
    private String name;
    private String age;
    private String address;
    private String city;
    private Integer genderId;
    private Integer classId;
    private Integer clubId;
    private Integer libraryId;
    private Integer schoolId;
    private Integer achievementId;
    private Integer mediumid;
    private Integer reportId;
}
