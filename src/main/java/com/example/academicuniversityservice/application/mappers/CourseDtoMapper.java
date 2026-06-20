package com.example.academicuniversityservice.application.mappers;

import com.example.academicuniversityservice.application.dto.request.SaveCourseRequest;
import com.example.academicuniversityservice.application.dto.response.CourseResponse;
import com.example.academicuniversityservice.domain.model.CourseModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CourseDtoMapper {
    CourseModel requestToModel(SaveCourseRequest saveCourseRequest);
    CourseResponse modelToResponse(CourseModel courseModel);
    List<CourseResponse> modelListToResponseList(List<CourseModel> courses);
}
