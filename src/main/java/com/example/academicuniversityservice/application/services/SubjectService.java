package com.example.academicuniversityservice.application.services;

import com.example.academicuniversityservice.application.dto.request.SaveSubjectRequest;
import com.example.academicuniversityservice.application.dto.response.SaveSubjectResponse;
import com.example.academicuniversityservice.application.dto.response.SubjectResponse;

import java.util.List;

public interface SubjectService {
    SaveSubjectResponse save(SaveSubjectRequest request);
    List<SubjectResponse> getSubjects();
}
