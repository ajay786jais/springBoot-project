package com.example.day3sms.service;

import com.example.day3sms.Model.StudentModel;
import com.example.day3sms.repository.Studentrepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class Studentservice {
    private Studentrepository repository;
    public Studentservice(Studentrepository repository) {
        this.repository = repository;
    }
    public StudentModel addStudent(StudentModel student){
        return repository.save(student);


    }

    public List<StudentModel> getStudents(){
        return repository.findAll();
    }
    public StudentModel updateStudent(String id, StudentModel Student){
        return repository.save(Student);
    }
    public void deleteStudentById(String id){
        repository.deleteById(id);
    }

}