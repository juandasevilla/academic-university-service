package com.example.academicuniversityservice.domain.ports.out;

import com.example.academicuniversityservice.domain.model.CourseModel;

import java.util.List;

public interface CoursePersistencePort {
    void saveCourse(CourseModel courseModel);
    List<CourseModel> getCourses();
}
