package com.example.academicuniversityservice.infrastructure.repositories.mysql;

import com.example.academicuniversityservice.infrastructure.entities.CourseEntity;
import com.example.academicuniversityservice.infrastructure.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    List<CourseEntity> findAll();
}
