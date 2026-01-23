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

public class SchoolDto {
    private Integer schoolid;
    private String schoolname;
    private String Schoolcode;
    private String address;
    private String type;
    private String medium;
    private String email;
    private String phone;
}
