package com.example.academicuniversityservice.infrastructure.endpoints.rest;

import com.example.academicuniversityservice.application.dto.request.SaveEnrollmentRequest;
import com.example.academicuniversityservice.application.dto.response.SaveEnrollmentResponse;
import com.example.academicuniversityservice.application.services.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/enrollment")
@RequiredArgsConstructor
public class EnrollmentController {
    private final EnrollmentService enrollmentService;

    @PostMapping
    @PreAuthorize("hasRole('Estudiante')")
    public ResponseEntity<SaveEnrollmentResponse> saveEnrollment(@RequestBody SaveEnrollmentRequest saveEnrollmentRequest) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // El ID de usuario está en los detalles de la autenticación
        Map<String, Object> details = (Map<String, Object>) authentication.getDetails();
        Long userId = (Long) details.get("userId");

        // Asignar el ID del usuario a la solicitud
        saveEnrollmentRequest.setStudentId(userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(enrollmentService.save(saveEnrollmentRequest));
    }
}
