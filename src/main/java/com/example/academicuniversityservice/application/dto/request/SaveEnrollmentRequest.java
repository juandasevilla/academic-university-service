package com.example.academicuniversityservice.application.dto.request;

import com.example.academicuniversityservice.domain.utils.EnrollmentStatus;

import java.time.LocalDate;

public class SaveEnrollmentRequest {
    private Long studentId;
    private Long courseId;
    private LocalDate enrolledAt;
    private EnrollmentStatus status;

    public SaveEnrollmentRequest(Long studentId, Long courseId,
                           LocalDate enrolledAt, EnrollmentStatus status) {
        setStudentId(studentId);
        setCourseId(courseId);
        this.enrolledAt = LocalDate.now();
        this.status = EnrollmentStatus.ACTIVE;
    }

    public Long getStudentId() { return studentId; }
    public Long getCourseId() { return courseId; }
    public LocalDate getEnrolledAt() { return enrolledAt; }
    public EnrollmentStatus getStatus() { return status; }


    public void setStudentId(Long studentId) { this.studentId = studentId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }
    public void setEnrolledAt(LocalDate enrolledAt) { this.enrolledAt = enrolledAt; }
    public void setStatus(EnrollmentStatus status) { this.status = status; }
}
