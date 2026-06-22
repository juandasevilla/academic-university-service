package com.example.academicuniversityservice.application.dto.request;

import com.example.academicuniversityservice.domain.model.SubjectModel;

import java.time.DayOfWeek;
import java.time.LocalTime;

public record SaveCourseRequest(Long subjectId, Long teacherId, Integer groupNumber, String classroom,
                                DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime, Integer maxStudents) {
    public Long getSubjectId() {
        return subjectId;
    }
}
