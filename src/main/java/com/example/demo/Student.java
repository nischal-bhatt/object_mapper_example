package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.beans.Transient;

public class Student {

    private String name;



    private String studentAge;

    private String anotherVar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getAnotherVar() {
        return anotherVar;
    }

    public void setAnotherVar(String anotherVar) {
        this.anotherVar = anotherVar;
    }
}

