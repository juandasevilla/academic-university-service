package com.example.academicuniversityservice.domain.ports.in;

import com.example.academicuniversityservice.domain.model.SubjectModel;

import java.util.List;

public interface SubjectServicePort {
    void saveSubject(SubjectModel subjectModel);
    List<SubjectModel> getSubjects();
}
