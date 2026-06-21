package com.example.academicuniversityservice.domain.ports.out;

import com.example.academicuniversityservice.domain.model.EnrollmentModel;

import java.util.List;

public interface EnrollmentPersistencePort {
    void saveEnrollment(EnrollmentModel enrollmentModel);
    List<EnrollmentModel> getEnrollmentsByUser(Long userId);
}
