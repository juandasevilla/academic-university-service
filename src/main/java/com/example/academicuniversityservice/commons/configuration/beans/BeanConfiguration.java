package com.example.academicuniversityservice.commons.configuration.beans;

import com.example.academicuniversityservice.domain.ports.in.CourseServicePort;
import com.example.academicuniversityservice.domain.ports.in.SubjectServicePort;
import com.example.academicuniversityservice.domain.ports.out.CoursePersistencePort;
import com.example.academicuniversityservice.domain.ports.out.SubjectPersistencePort;
import com.example.academicuniversityservice.domain.usecases.CourseUseCase;
import com.example.academicuniversityservice.domain.usecases.SubjectUseCase;
import com.example.academicuniversityservice.infrastructure.adapters.persistence.CoursePersistenceAdapter;
import com.example.academicuniversityservice.infrastructure.adapters.persistence.SubjectPersistenceAdapter;
import com.example.academicuniversityservice.infrastructure.mappers.CourseEntityMapper;
import com.example.academicuniversityservice.infrastructure.mappers.SubjectEntityMapper;
import com.example.academicuniversityservice.infrastructure.repositories.mysql.CourseRepository;
import com.example.academicuniversityservice.infrastructure.repositories.mysql.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final SubjectRepository subjectRepository;
    private final SubjectEntityMapper subjectEntityMapper;
    private final CourseRepository courseRepository;
    private final CourseEntityMapper courseEntityMapper;


    public SubjectPersistencePort subjectPersistencePort() {
        return new SubjectPersistenceAdapter(subjectRepository, subjectEntityMapper);
    }

    @Bean
    public SubjectServicePort roleServicePort() {
        return new SubjectUseCase(subjectPersistencePort());
    }

    private CoursePersistencePort coursePersistencePort() {
        return new CoursePersistenceAdapter(courseRepository, courseEntityMapper);
    }

    @Bean
    public CourseServicePort courseServicePort() {
        return new CourseUseCase(coursePersistencePort());
    }
}
