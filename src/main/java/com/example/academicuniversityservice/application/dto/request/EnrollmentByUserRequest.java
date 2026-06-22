package com.example.academicuniversityservice.application.dto.request;

public class EnrollmentByUserRequest {
    private Long id;

    public EnrollmentByUserRequest(Long id) {
        this.id = id;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
}
