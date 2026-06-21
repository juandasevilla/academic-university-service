package com.example.academicuniversityservice.domain.ports.in;


import com.example.academicuniversityservice.domain.model.CourseModel;

import java.util.List;

public interface CourseServicePort {
    void saveCourse(CourseModel courseModel);
    List<CourseModel> getCourses();
}
