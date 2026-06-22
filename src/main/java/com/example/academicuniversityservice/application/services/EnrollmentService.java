package com.example.academicuniversityservice.application.services;

import com.example.academicuniversityservice.application.dto.request.EnrollmentByUserRequest;
import com.example.academicuniversityservice.application.dto.request.SaveEnrollmentRequest;
import com.example.academicuniversityservice.application.dto.response.EnrollmentResponse;
import com.example.academicuniversityservice.application.dto.response.SaveEnrollmentResponse;
import com.example.academicuniversityservice.application.dto.response.SubjectResponse;

import java.util.List;

public interface EnrollmentService {
    SaveEnrollmentResponse save(SaveEnrollmentRequest request);
    List<EnrollmentResponse> getEnrollmentsByUser(Long  userId);
}
