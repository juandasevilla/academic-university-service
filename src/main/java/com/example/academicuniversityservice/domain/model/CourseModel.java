package com.example.academicuniversityservice.domain.model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class CourseModel {
    private Long id;
    private SubjectModel subject;
    private Long teacherId;
    private Integer groupNumber;
    private String classroom;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer maxStudents;

    public CourseModel(Long id, SubjectModel subject, Long teacherId, Integer groupNumber, String classroom,
                       DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime, Integer maxStudents) {
        this.id = id;
        setSubject(subject);
        setTeacherId(teacherId);
        setGroupNumber(groupNumber);
        setClassroom(classroom);
        setDayOfWeek(dayOfWeek);
        setStartTime(startTime);
        setEndTime(endTime);
        setMaxStudents(maxStudents);
    }

    public Long getId() {return id;}
    public SubjectModel getSubject() {return subject;}
    public Long getTeacherId() {return teacherId;}
    public Integer getGroupNumber() {return groupNumber;}
    public String getClassroom() {return classroom;}
    public DayOfWeek getDayOfWeek() {return dayOfWeek;}
    public LocalTime getStartTime() {return startTime;}
    public LocalTime getEndTime() {return endTime;}
    public Integer getMaxStudents() {return maxStudents;}

    public void setSubject(SubjectModel subject) {this.subject = subject;}
    public void setTeacherId(Long teacherId) {this.teacherId = teacherId;}
    public void setGroupNumber(Integer groupNumber) {this.groupNumber = groupNumber;}
    public void setClassroom(String classroom) {this.classroom = classroom;}
    public void setDayOfWeek(DayOfWeek dayOfWeek) {this.dayOfWeek = dayOfWeek;}
    public void setStartTime(LocalTime startTime) {this.startTime = startTime;}
    public void setEndTime(LocalTime endTime) {this.endTime = endTime;}
    public void setMaxStudents(Integer maxStudents) {this.maxStudents = maxStudents;}
}
