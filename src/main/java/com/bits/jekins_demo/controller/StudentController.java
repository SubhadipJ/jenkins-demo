package com.bits.jekins_demo.controller;

import com.bits.jekins_demo.enity.Student;
import com.bits.jekins_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.createStudent(student));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
       return  ResponseEntity.ok(studentService.updateStudent(student));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteStudentById(@RequestParam int id) {
        return ResponseEntity.ok(studentService.deleteStudentById(id));
    }
}
