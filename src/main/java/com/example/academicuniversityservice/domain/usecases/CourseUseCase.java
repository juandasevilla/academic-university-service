package com.example.academicuniversityservice.domain.usecases;

import com.example.academicuniversityservice.domain.model.CourseModel;
import com.example.academicuniversityservice.domain.ports.in.CourseServicePort;
import com.example.academicuniversityservice.domain.ports.out.CoursePersistencePort;

import java.util.List;


public class CourseUseCase implements CourseServicePort {
    private final CoursePersistencePort coursePersistencePort;

    public CourseUseCase(CoursePersistencePort coursePersistencePort) {
        this.coursePersistencePort = coursePersistencePort;
    }

    @Override
    public void saveCourse(CourseModel courseModel) {
        coursePersistencePort.saveCourse(courseModel);
    }

    @Override
    public List<CourseModel> getCourses() {
        return coursePersistencePort.getCourses();
    }


}
