package com.example.academicuniversityservice.infrastructure.adapters.persistence;

import com.example.academicuniversityservice.domain.model.EnrollmentModel;
import com.example.academicuniversityservice.domain.model.SubjectModel;
import com.example.academicuniversityservice.domain.ports.out.EnrollmentPersistencePort;
import com.example.academicuniversityservice.infrastructure.mappers.EnrollmentEntityMapper;
import com.example.academicuniversityservice.infrastructure.repositories.mysql.EnrollmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EnrollmentPersistenceAdapter implements EnrollmentPersistencePort {
    private final EnrollmentRepository enrollmentRepository;
    private final EnrollmentEntityMapper enrollmentEntityMapper;

    @Override
    public void saveEnrollment(EnrollmentModel enrollmentModel) {
        enrollmentRepository.save(enrollmentEntityMapper.modelToEntity(enrollmentModel));
    }

    @Override
    public List<EnrollmentModel> getEnrollmentsByUser(Long userId) {
        return enrollmentEntityMapper.entityListToModelList(enrollmentRepository.findByStudentId(userId));
    }
}
