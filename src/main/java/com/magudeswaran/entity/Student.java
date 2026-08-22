package com.magudeswaran.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="student")
@Data
public class Student {

    @Id
    private String rollNumber;
    private String name;
    private String emailId;
    private String classSection;
    private String fatherName;
    private String motherName;
    private String address;
    private String contactNumber;
    @CreationTimestamp
    private LocalDateTime created_timestamp;
    @UpdateTimestamp
    private LocalDateTime updated_timestamp;

}
