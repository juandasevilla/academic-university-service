package com.example.academicuniversityservice.infrastructure.repositories.mysql;

import com.example.academicuniversityservice.infrastructure.entities.EnrollmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<EnrollmentEntity, Long> {
    List<EnrollmentEntity> findAll();
    List<EnrollmentEntity> findByStudentId(Long studentId);
}
