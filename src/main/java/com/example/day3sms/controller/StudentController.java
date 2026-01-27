package com.example.day3sms.controller;

import com.example.day3sms.Model.StudentModel;
import com.example.day3sms.service.Studentservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final Studentservice service;
    public StudentController(Studentservice service){
        this.service = service;
    }
   // create
    @PostMapping("/add-student")
    public StudentModel addStudent(@RequestBody StudentModel student){
        return service.addStudent(student);
    }
  // display
    @GetMapping("/Students")
    public List<StudentModel>  getStudents(){
        return service.getStudents();
    }

    // update
    @PutMapping("/update/{id}")
    public StudentModel updateStudent(@PathVariable String id, @RequestBody StudentModel student) {
        return service.updateStudent(id, student);
    }

    // delete
    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable String id){
        service.deleteStudentById(id);
    }



}