package com.example.academicuniversityservice.domain.ports.in;


import com.example.academicuniversityservice.domain.model.CourseModel;
import com.example.academicuniversityservice.domain.model.EnrollmentModel;

import java.util.List;

public interface EnrollmentServicePort {
    void saveEnrollment(EnrollmentModel enrollmentModel);
    List<EnrollmentModel> getEnrollmentsByUser(Long userId);
}
