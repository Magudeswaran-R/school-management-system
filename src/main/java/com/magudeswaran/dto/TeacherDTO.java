package com.magudeswaran.dto;

import lombok.Data;

@Data
public class TeacherDTO {

    private String employeeNumber;
    private String name;
    private String email;
    private String address;
    private String contactNumber;
    private String classTeacherFor;
    private Long salary;

}
