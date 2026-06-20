package com.example.academicuniversityservice.application.services.impl;

import com.example.academicuniversityservice.application.dto.request.SaveSubjectRequest;
import com.example.academicuniversityservice.application.dto.response.SaveSubjectResponse;
import com.example.academicuniversityservice.application.dto.response.SubjectResponse;
import com.example.academicuniversityservice.application.mappers.SubjectDtoMapper;
import com.example.academicuniversityservice.application.services.SubjectService;
import com.example.academicuniversityservice.domain.ports.in.SubjectServicePort;
import com.example.academicuniversityservice.domain.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {
    private final SubjectServicePort subjectServiceport;
    private final SubjectDtoMapper subjectDtoMapper;

    @Override
    public SaveSubjectResponse save(SaveSubjectRequest request) {
        subjectServiceport.saveSubject(subjectDtoMapper.requestToModel(request));
        return new SaveSubjectResponse(Constants.SAVE_SUBJECT_RESPONSE_MESSAGE, LocalDateTime.now());
    }

    @Override
    public List<SubjectResponse> getSubjects() {
        return subjectDtoMapper.modelListToResponseList(subjectServiceport.getSubjects());
    }

}
