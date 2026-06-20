package com.example.academicuniversityservice.infrastructure.adapters.persistence;

import com.example.academicuniversityservice.domain.model.CourseModel;
import com.example.academicuniversityservice.domain.ports.out.CoursePersistencePort;
import com.example.academicuniversityservice.infrastructure.mappers.CourseEntityMapper;
import com.example.academicuniversityservice.infrastructure.repositories.mysql.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CoursePersistenceAdapter implements CoursePersistencePort {
    private final CourseRepository courseRepository;
    private final CourseEntityMapper courseEntityMapper;

    @Override
    public void saveCourse(CourseModel courseModel) {
        courseRepository.save(courseEntityMapper.modelToEntity(courseModel));
    }

}
