package com.magudeswaran.service;

import com.magudeswaran.dto.StudentDTO;
import com.magudeswaran.dto.TeacherDTO;
import com.magudeswaran.entity.Student;
import com.magudeswaran.entity.Teacher;
import com.magudeswaran.repository.StudentRepository;
import com.magudeswaran.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;
    private final ModelMapper mapper;

    public void createStudent(StudentDTO student){
        studentRepository.save(mapper.map(student, Student.class));
    }

    public void createTeacher(TeacherDTO teacher){
        teacherRepository.save(mapper.map(teacher, Teacher.class));
    }

}
