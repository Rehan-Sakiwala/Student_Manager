package com.example.Marvel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import java.util.HashMap;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/Get_Student")
    public Student getStudent(@RequestParam("q") int admnNo){
        return studentService.getStudent(admnNo);
    }


    @PostMapping("/Add_Student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/Delete_Student/{id}")
    public String deleteStudent(@PathVariable("id")int id){
        return studentService.deleteStudent(id);
    }

    @PutMapping("/Update_Student")
    public String updateStudent(@RequestParam("id")int id,@RequestParam("age") int age){
        return studentService.updateStudent(id,age);
    }
}
