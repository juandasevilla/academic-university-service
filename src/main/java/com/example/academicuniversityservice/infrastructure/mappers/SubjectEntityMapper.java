package com.example.academicuniversityservice.infrastructure.mappers;

import com.example.academicuniversityservice.domain.model.SubjectModel;
import com.example.academicuniversityservice.infrastructure.entities.SubjectEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SubjectEntityMapper {
    SubjectEntity modelToEntity(SubjectModel subjectModel);
    SubjectModel entityToModel(SubjectEntity subjectEntity);
    List<SubjectModel> entityListToModelList(List<SubjectEntity> subjects);
}
