package com.example.academicuniversityservice.infrastructure.endpoints.rest;

import com.example.academicuniversityservice.application.dto.request.SaveSubjectRequest;
import com.example.academicuniversityservice.application.dto.response.SaveSubjectResponse;
import com.example.academicuniversityservice.application.dto.response.SubjectResponse;
import com.example.academicuniversityservice.application.services.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subject")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<SaveSubjectResponse> saveSubject(@RequestBody SaveSubjectRequest saveSubjectRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(subjectService.save(saveSubjectRequest));
    }

    @GetMapping
    public ResponseEntity<List<SubjectResponse>> getSubjects() {
        return ResponseEntity.ok(subjectService.getSubjects());
    }
}
