package com.example.academicuniversityservice.domain.usecases;

import com.example.academicuniversityservice.domain.exceptions.SubjectAlreadyExistsException;
import com.example.academicuniversityservice.domain.model.SubjectModel;
import com.example.academicuniversityservice.domain.ports.in.SubjectServicePort;
import com.example.academicuniversityservice.domain.ports.out.SubjectPersistencePort;

import java.util.List;

public class SubjectUseCase implements SubjectServicePort {
    private final SubjectPersistencePort subjectPersistencePort;

    public SubjectUseCase(SubjectPersistencePort subjectPersistencePort) {
        this.subjectPersistencePort = subjectPersistencePort;
    }

    @Override
    public void saveSubject(SubjectModel subjectModel) {
        SubjectModel subject = subjectPersistencePort.getSubjectByCode(subjectModel.getCode());
        if (subject != null) {
            throw new SubjectAlreadyExistsException();
        }
        subjectPersistencePort.saveSubject(subjectModel);
    }

    @Override
    public List<SubjectModel> getSubjects() {
        return subjectPersistencePort.getSubjects();
    }
}
