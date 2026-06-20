package com.example.academicuniversityservice.application.services.impl;

import com.example.academicuniversityservice.application.dto.request.SaveCourseRequest;
import com.example.academicuniversityservice.application.dto.response.SaveCourseResponse;
import com.example.academicuniversityservice.application.mappers.CourseDtoMapper;
import com.example.academicuniversityservice.application.services.CourseService;
import com.example.academicuniversityservice.domain.exceptions.SubjectIsRequiredException;
import com.example.academicuniversityservice.domain.model.CourseModel;
import com.example.academicuniversityservice.domain.model.SubjectModel;
import com.example.academicuniversityservice.domain.ports.in.CourseServicePort;
import com.example.academicuniversityservice.domain.ports.out.SubjectPersistencePort;
import com.example.academicuniversityservice.domain.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseServicePort courseServicePort;
    private final CourseDtoMapper courseDtoMapper;
    private final SubjectPersistencePort subjectPersistencePort;

    @Override
    public SaveCourseResponse save(SaveCourseRequest request) {
        CourseModel courseModel = courseDtoMapper.requestToModel(request);

        SubjectModel subjectModel = subjectPersistencePort.findById(request.getSubjectId())
                .orElseThrow(() -> new SubjectIsRequiredException());

        courseModel.setSubject(subjectModel);

        courseServicePort.saveCourse(courseModel);
        return new SaveCourseResponse(Constants.SAVE_COURSE_RESPONSE_MESSAGE, LocalDateTime.now());
    }

}
