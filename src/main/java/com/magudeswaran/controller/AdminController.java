package com.magudeswaran.controller;

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

}
