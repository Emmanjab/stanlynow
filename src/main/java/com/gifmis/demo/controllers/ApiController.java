package com.gifmis.demo.controllers;

import com.gifmis.demo.entities.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1")

public class ApiController {

    @GetMapping("students")
    public ArrayList<Students> getStudents(){

        Students student1 = new Students();
        student1.setMatriculationNumber("BHU/13/04/05/0026");

        Students students2 = new Students();
        students2.setMatriculationNumber("BHU/13/04/07/0126");

        ArrayList<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(students2);

        return students;
    }





}
