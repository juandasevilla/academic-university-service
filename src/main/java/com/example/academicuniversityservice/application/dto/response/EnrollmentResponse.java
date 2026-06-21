package com.example.academicuniversityservice.application.dto.response;

import com.example.academicuniversityservice.domain.model.CourseModel;
import com.example.academicuniversityservice.domain.utils.EnrollmentStatus;

import java.time.LocalDate;

public record EnrollmentResponse(Long id, Long studentId, CourseModel course,
                                 LocalDate enrolledAt, EnrollmentStatus status, Double grade) {
}
