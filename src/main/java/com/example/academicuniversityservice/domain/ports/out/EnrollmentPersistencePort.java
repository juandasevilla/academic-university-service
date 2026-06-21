package com.example.academicuniversityservice.domain.ports.out;

import com.example.academicuniversityservice.domain.model.EnrollmentModel;

public interface EnrollmentPersistencePort {
    void saveEnrollment(EnrollmentModel enrollmentModel);
}
