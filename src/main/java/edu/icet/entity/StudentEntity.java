package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="Stduent")
@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Student_Id;
    private String Student_Name;
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
