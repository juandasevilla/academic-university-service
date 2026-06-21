package com.example.academicuniversityservice.application.services;


import com.example.academicuniversityservice.application.dto.request.SaveCourseRequest;
import com.example.academicuniversityservice.application.dto.response.CourseResponse;
import com.example.academicuniversityservice.application.dto.response.SaveCourseResponse;

import java.util.List;

public interface CourseService {
    SaveCourseResponse save(SaveCourseRequest request);
    List<CourseResponse> getCourses();
}
