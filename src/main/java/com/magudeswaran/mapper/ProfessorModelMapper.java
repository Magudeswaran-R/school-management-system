package com.magudeswaran.mapper;

import com.magudeswaran.dto.ProfessorDTO;
import com.magudeswaran.entity.Professor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@RequiredArgsConstructor
public class ProfessorModelMapper {

    private final ModelMapper mapper;

    public Professor convertToEntity(ProfessorDTO professorDTO){
        Professor professor = mapper.map(professorDTO, Professor.class);
        professor.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        professor.setUpdatedDate(new Timestamp(System.currentTimeMillis()));
        professor.setIsActive('Y');
        return professor;
    }

}
