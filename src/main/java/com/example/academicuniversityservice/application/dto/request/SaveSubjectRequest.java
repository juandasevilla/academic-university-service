package com.example.academicuniversityservice.application.dto.request;

public record SaveSubjectRequest(String name, String code, Integer credits, String description) {
}
