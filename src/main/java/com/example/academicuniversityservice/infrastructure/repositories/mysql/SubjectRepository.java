package com.example.academicuniversityservice.infrastructure.repositories.mysql;

import com.example.academicuniversityservice.infrastructure.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
    Optional<SubjectEntity> findByCode(String code);
    List<SubjectEntity> findAll();
}
