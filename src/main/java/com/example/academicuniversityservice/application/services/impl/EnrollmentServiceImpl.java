package com.example.academicuniversityservice.application.services.impl;

import com.example.academicuniversityservice.application.dto.request.EnrollmentByUserRequest;
import com.example.academicuniversityservice.application.dto.request.SaveEnrollmentRequest;
import com.example.academicuniversityservice.application.dto.response.EnrollmentResponse;
import com.example.academicuniversityservice.application.dto.response.SaveEnrollmentResponse;
import com.example.academicuniversityservice.application.dto.response.SaveSubjectResponse;
import com.example.academicuniversityservice.application.mappers.EnrollmentDtoMapper;
import com.example.academicuniversityservice.application.services.EnrollmentService;
import com.example.academicuniversityservice.domain.exceptions.SubjectIsRequiredException;
import com.example.academicuniversityservice.domain.model.CourseModel;
import com.example.academicuniversityservice.domain.model.EnrollmentModel;
import com.example.academicuniversityservice.domain.model.SubjectModel;
import com.example.academicuniversityservice.domain.ports.in.EnrollmentServicePort;
import com.example.academicuniversityservice.domain.ports.out.CoursePersistencePort;
import com.example.academicuniversityservice.domain.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService {
    private final EnrollmentServicePort enrollmentServicePort;
    private final EnrollmentDtoMapper enrollmentDtoMapper;
    private final CoursePersistencePort  coursePersistencePort;

    @Override
    public SaveEnrollmentResponse save(SaveEnrollmentRequest request){
        EnrollmentModel enrollmentModel = enrollmentDtoMapper.requestToModel(request);

        CourseModel courseModel = coursePersistencePort.findById(request.getCourseId())
                .orElseThrow(() -> new SubjectIsRequiredException());

        enrollmentModel.setCourse(courseModel);

        enrollmentServicePort.saveEnrollment(enrollmentModel);

        return new SaveEnrollmentResponse(Constants.SAVE_SUBJECT_RESPONSE_MESSAGE, LocalDateTime.now());
    }

    @Override
    public List<EnrollmentResponse> getEnrollmentsByUser(Long userId){
        return enrollmentDtoMapper.modelListToResponseList(enrollmentServicePort.getEnrollmentsByUser(userId));
    }

}
