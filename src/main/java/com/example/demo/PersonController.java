package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    @PostMapping
    public Person convertStudent(@RequestBody Student student)
    {
        System.out.println("printing student's properties");
        System.out.println(student.getStudentAge());
        System.out.println(student.getName());
        System.out.println(student.getAnotherVar());
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.convertValue(student,Person.class);
        System.out.println("printing person's properties");
        System.out.println(person.getStudentAge());
        System.out.println(person.getName());
        return person;
    }

}
