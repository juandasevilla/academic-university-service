package com.example.academicuniversityservice.application.services;

import com.example.academicuniversityservice.application.dto.request.SaveEnrollmentRequest;
import com.example.academicuniversityservice.application.dto.response.SaveEnrollmentResponse;

public interface EnrollmentService {
    SaveEnrollmentResponse save(SaveEnrollmentRequest request);
}
