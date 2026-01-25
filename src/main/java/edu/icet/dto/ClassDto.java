package edu.icet.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

public class ClassDto {

    private Integer id;
    private String className;
    private String classcode;
    private String studetid;
    private String monitorid;
}
