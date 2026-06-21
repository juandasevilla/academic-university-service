package com.example.academicuniversityservice.domain.ports.in;


import com.example.academicuniversityservice.domain.model.EnrollmentModel;

public interface EnrollmentServicePort {
    void saveEnrollment(EnrollmentModel enrollmentModel);
}
