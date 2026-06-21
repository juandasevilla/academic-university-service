package com.example.academicuniversityservice.domain.usecases;

import com.example.academicuniversityservice.domain.model.EnrollmentModel;
import com.example.academicuniversityservice.domain.ports.in.EnrollmentServicePort;
import com.example.academicuniversityservice.domain.ports.out.EnrollmentPersistencePort;

public class EnrollmentUseCase implements EnrollmentServicePort {
    private final EnrollmentPersistencePort enrollmentPersistencePort;

    public EnrollmentUseCase(EnrollmentPersistencePort enrollmentPersistencePort) {
        this.enrollmentPersistencePort = enrollmentPersistencePort;
    }

    @Override
    public void saveEnrollment(EnrollmentModel enrollmentModel) {
        enrollmentPersistencePort.saveEnrollment(enrollmentModel);
    }
}
