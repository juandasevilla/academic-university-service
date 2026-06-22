package com.example.academicuniversityservice.application.mappers;


import com.example.academicuniversityservice.application.dto.request.SaveEnrollmentRequest;
import com.example.academicuniversityservice.application.dto.response.EnrollmentResponse;
import com.example.academicuniversityservice.domain.model.EnrollmentModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EnrollmentDtoMapper {
    EnrollmentModel requestToModel(SaveEnrollmentRequest saveEnrollmentRequest);
    EnrollmentResponse modelToResponse(EnrollmentModel enrollmentModel);
    List<EnrollmentResponse> modelListToResponseList(List<EnrollmentModel> enrollments);
}
