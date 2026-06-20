package com.example.academicuniversityservice.domain.model;

import com.example.academicuniversityservice.domain.exceptions.NullOrSpaceException;

public class SubjectModel {
    private Long id;
    private String name;
    private String code;
    private Integer credits;
    private String description;

    public SubjectModel(Long id, String name, String code, Integer credits, String description){
        this.id = id;
        setName(name);
        setCode(code);
        setCredits(credits);
        setDescription(description);
    }

    public Long getId(){return id;}

    public String getName(){return name;}

    public String getCode(){return code;}

    public Integer getCredits(){return credits;}

    public String getDescription(){return description;}

    public void setName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new NullOrSpaceException();
        }
        this.name = name;
    }

    public void setCode(String code){
        if (code == null || code.trim().isEmpty()){
            throw new NullOrSpaceException();
        }
        this.code = code;
    }

    public void setCredits(Integer credits){
        if (credits == null || credits <= 0) {
            throw new NullOrSpaceException();
        }
        this.credits = credits;
    }

    public void setDescription(String description){this.description = description;}

}
