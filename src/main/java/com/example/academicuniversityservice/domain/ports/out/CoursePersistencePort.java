package com.example.academicuniversityservice.domain.ports.out;

import com.example.academicuniversityservice.domain.model.CourseModel;

public interface CoursePersistencePort {
    void saveCourse(CourseModel courseModel);
}
