package com.example.academicuniversityservice.domain.ports.in;


import com.example.academicuniversityservice.domain.model.CourseModel;

public interface CourseServicePort {
    void saveCourse(CourseModel courseModel);
}
