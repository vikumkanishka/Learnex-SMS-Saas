package edu.icet.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "school_details")

public class SchoolDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer schoolid;
    private String schoolname;
    private String Schoolcode;
    private String address;
    private String type;
    private String medium;
    private String email;
    private String phone;
}
