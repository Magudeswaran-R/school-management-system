package com.magudeswaran.controller;

import com.magudeswaran.dto.StudentDTO;
import com.magudeswaran.dto.TeacherDTO;
import com.magudeswaran.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/ping")
    public String healthTest(){
        return "Ping Successful.....";
    }

    @PostMapping("/student")
    public String createStudent(@RequestBody StudentDTO student){
        adminService.createStudent(student);
        return "Student record created successfully";
    }

    public String createTeacher(@RequestBody TeacherDTO teacher){
        adminService.createTeacher(teacher);
        return "Teacher Record created successfully";
    }

}
