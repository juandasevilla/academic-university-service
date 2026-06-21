package com.example.academicuniversityservice.infrastructure.mappers;


import com.example.academicuniversityservice.domain.model.EnrollmentModel;
import com.example.academicuniversityservice.infrastructure.entities.EnrollmentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EnrollmentEntityMapper {
    EnrollmentEntity modelToEntity(EnrollmentModel enrollmentModel);
    EnrollmentModel entityToModel(EnrollmentEntity enrollmentEntity);
    List<EnrollmentModel> entityListToModelList(List<EnrollmentEntity> enrollments);
}
