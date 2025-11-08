package com.magudeswaran.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="PROFESSOR")
@Data
public class Professor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="First_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="date_of_birth")
    private Date dateOfBirth;

    @Column(name="gender")
    private String gender;

    @Column(name="date_of_joining")
    private Date dateOfJoining;

    @Column(name="address")
    private String address;

    @Column(name="is_active")
    private Character isActive;

    @Column(name="created_date")
    private Timestamp createdDate;

    @Column(name="updated_date")
    private Timestamp updatedDate;
}
