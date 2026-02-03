package com.example.day3sms.controller;

import com.example.day3sms.Model.StudentModel;
import com.example.day3sms.dto.StudentRequestDto;
import com.example.day3sms.dto.StudentResponseDto;
import com.example.day3sms.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service){
        this.service = service;
    }
   // create
    @PostMapping("/add-student")
    public StudentResponseDto addStudent(@Valid @RequestBody StudentRequestDto student){
        return service.addStudent(student);
    }
  // display
    @GetMapping("/Students")
    public List<StudentResponseDto>  getStudents(){
        return service.getAllStudents();
    }

    // update
    @PutMapping("/update/{id}")
    public ResponseEntity<StudentResponseDto> updateStudent(@PathVariable String id, @RequestBody StudentRequestDto student) {
        StudentResponseDto updated = service.updateStudent(id, student);
        return ResponseEntity.ok(updated);
    }

    // delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable String id){
        service.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }



}