package com.magudeswaran.service;

import com.magudeswaran.dto.ProfessorDTO;
import com.magudeswaran.entity.Professor;
import com.magudeswaran.mapper.ProfessorModelMapper;
import com.magudeswaran.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final ProfessorModelMapper professorModelMapper;
    private final ProfessorRepository professorRepository;

    public void addProfessor(ProfessorDTO professorDTO){

        Professor prof = professorModelMapper.convertToEntity(professorDTO);

        professorRepository.save(prof);

    }

}
