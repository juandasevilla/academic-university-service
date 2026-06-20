package com.example.academicuniversityservice.application.mappers;

import com.example.academicuniversityservice.application.dto.request.SaveSubjectRequest;
import com.example.academicuniversityservice.application.dto.response.SubjectResponse;
import com.example.academicuniversityservice.domain.model.SubjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SubjectDtoMapper {
    SubjectModel requestToModel(SaveSubjectRequest saveSubjectRequest);
    SubjectResponse modelToResponse(SubjectModel subjectModel);
    List<SubjectResponse> modelListToResponseList(List<SubjectModel> subjects);
}
