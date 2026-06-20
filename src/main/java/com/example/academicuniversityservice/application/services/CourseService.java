package com.example.academicuniversityservice.application.services;


import com.example.academicuniversityservice.application.dto.request.SaveCourseRequest;
import com.example.academicuniversityservice.application.dto.response.SaveCourseResponse;

public interface CourseService {
    SaveCourseResponse save(SaveCourseRequest request);
}
