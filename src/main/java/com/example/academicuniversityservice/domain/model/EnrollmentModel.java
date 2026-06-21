package com.example.academicuniversityservice.domain.model;

import com.example.academicuniversityservice.domain.utils.EnrollmentStatus;

import java.time.LocalDate;

public class EnrollmentModel {
    private Long id;
    private Long studentId;
    private CourseModel course;
    private LocalDate enrolledAt;
    private EnrollmentStatus status;
    private Double grade;

    public EnrollmentModel(Long id, Long studentId, CourseModel course,
                           LocalDate enrolledAt, EnrollmentStatus status, Double grade) {
        this.id = id;
        setStudentId(studentId);
        setCourse(course);
        setEnrolledAt(enrolledAt);
        setStatus(status);
        setGrade(grade);
    }

    public Long getId() { return id; }
    public Long getStudentId() { return studentId; }
    public CourseModel getCourse() { return course; }
    public LocalDate getEnrolledAt() { return enrolledAt; }
    public EnrollmentStatus getStatus() { return status; }
    public Double getGrade() { return grade; }

    public void setStudentId(Long studentId) { this.studentId = studentId; }
    public void setCourse(CourseModel course) { this.course = course; }
    public void setEnrolledAt(LocalDate enrolledAt) { this.enrolledAt = enrolledAt; }
    public void setStatus(EnrollmentStatus status) { this.status = status; }
    public void setGrade(Double grade) { this.grade = grade; }
}
