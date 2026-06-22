package com.example.academicuniversityservice.application.dto.response;

import com.example.academicuniversityservice.domain.model.SubjectModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {
    private Long id;
    private SubjectModel subject;
    private Integer groupNumber;
    private String classroom;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer maxStudents;

    // campos planos del teacher — otro micro
    private Long teacherId;
    private String teacherName;
    private String teacherLastName;
}
