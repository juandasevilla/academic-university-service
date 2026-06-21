package com.example.academicuniversityservice.domain.ports.out;

import com.example.academicuniversityservice.domain.model.CourseModel;
import com.example.academicuniversityservice.domain.model.SubjectModel;

import java.util.List;
import java.util.Optional;

public interface CoursePersistencePort {
    void saveCourse(CourseModel courseModel);
    List<CourseModel> getCourses();
    Optional<CourseModel> findById(Long id);
}
