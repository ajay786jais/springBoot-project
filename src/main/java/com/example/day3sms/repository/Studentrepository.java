
package com.example.day3sms.repository;


import com.example.day3sms.Model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Studentrepository extends MongoRepository <StudentModel,String>{

}
