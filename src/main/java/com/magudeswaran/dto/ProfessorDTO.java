package com.magudeswaran.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProfessorDTO {

    private String firstName;

    private String lastName;

    private Date dateOfBirth;

    private String gender;

    private Date dateOfJoining;

    private String address;

}
