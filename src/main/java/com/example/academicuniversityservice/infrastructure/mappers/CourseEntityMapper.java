package com.example.academicuniversityservice.infrastructure.mappers;


import com.example.academicuniversityservice.domain.model.CourseModel;
import com.example.academicuniversityservice.infrastructure.entities.CourseEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseEntityMapper {
    CourseEntity modelToEntity(CourseModel courseModel);
    CourseModel entityToModel(CourseEntity courseEntity);
    List<CourseModel> entityListToModelList(List<CourseEntity> courses);
}
