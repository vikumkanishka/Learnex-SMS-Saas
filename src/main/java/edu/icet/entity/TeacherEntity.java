package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String salary;
    private Date dob;
    private Integer cityid;
    private Integer genderid;
    private Integer streamid;
    private Integer categoryid;
    private Integer schoolid;
    private Integer subjectid;
    private Integer studentid;
    private Integer departmentid;
    private Integer classid;
    private Integer libraryid;
    private Integer mediumid;
    private Integer timetableid;
    private Integer statusid;
}
