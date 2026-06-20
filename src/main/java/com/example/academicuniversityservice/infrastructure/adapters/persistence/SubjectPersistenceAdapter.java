package com.example.academicuniversityservice.infrastructure.adapters.persistence;

import com.example.academicuniversityservice.application.services.SubjectService;
import com.example.academicuniversityservice.domain.model.SubjectModel;
import com.example.academicuniversityservice.domain.ports.out.SubjectPersistencePort;
import com.example.academicuniversityservice.infrastructure.mappers.SubjectEntityMapper;
import com.example.academicuniversityservice.infrastructure.repositories.mysql.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class SubjectPersistenceAdapter implements SubjectPersistencePort {
    private final SubjectRepository subjectRepository;
    private final SubjectEntityMapper subjectEntityMapper;

    @Override
    public void saveSubject(SubjectModel subjectModel) {
        subjectRepository.save(subjectEntityMapper.modelToEntity(subjectModel));
    }

    @Override
    public List<SubjectModel> getSubjects() {
        return subjectEntityMapper.entityListToModelList(subjectRepository.findAll());
    }

    @Override
    public SubjectModel getSubjectByCode(String roleCode) {
        return subjectEntityMapper.entityToModel(subjectRepository.findByCode(roleCode).orElse(null));
    }

    @Override
    public Optional<SubjectModel> findById(Long id) {
        return subjectRepository.findById(id).map(subjectEntityMapper::entityToModel);
    }

}
