package com.example.Marvel;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer,Student> db=new HashMap<>();

    public Student getStudent(int id){
        return db.get(id);
    }

    public String addStudent(Student student){
        int id=student.getAdmnNo();
        db.put(id,student);
        return "Added Successfully";
    }

    public  String deleteStudent(int id){
        if(db.containsKey(id)){
            db.remove(id);
            return "Student removed successfully";
        }
        else
            return "Invalid Id";
    }

    public String updateStudent(int id,int age){
        if(!db.containsKey(id)){
            return "Invalid id";
        }
        else{
            db.get(id).setAge(age);
            return "Age updated successfully";
        }
    }
}
