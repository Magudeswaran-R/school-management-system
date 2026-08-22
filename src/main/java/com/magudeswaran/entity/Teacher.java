package com.magudeswaran.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="teacher")
@Data
public class Teacher {
    @Id
    private String employeeNumber;
    private String name;
    private String email;
    private String address;
    private String contactNumber;
    private String classTeacherFor;
    private Long salary;
    @CreationTimestamp
    private LocalDateTime created_timestamp;
    @UpdateTimestamp
    private LocalDateTime updated_timestamp;
}
