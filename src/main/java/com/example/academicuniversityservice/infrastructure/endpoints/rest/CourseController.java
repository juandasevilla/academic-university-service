package com.example.academicuniversityservice.infrastructure.endpoints.rest;

import com.example.academicuniversityservice.application.dto.request.SaveCourseRequest;
import com.example.academicuniversityservice.application.dto.response.SaveCourseResponse;
import com.example.academicuniversityservice.application.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<SaveCourseResponse> saveCourse(@RequestBody SaveCourseRequest saveCourseRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(courseService.save(saveCourseRequest));
    }
}
