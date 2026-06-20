package com.example.academicuniversityservice.domain.ports.out;

import com.example.academicuniversityservice.domain.model.SubjectModel;

import java.util.List;
import java.util.Optional;

public interface SubjectPersistencePort {
    void saveSubject(SubjectModel subjectModel);
    List<SubjectModel> getSubjects();
    SubjectModel getSubjectByCode(String roleCode);
    Optional<SubjectModel> findById(Long id);
}
