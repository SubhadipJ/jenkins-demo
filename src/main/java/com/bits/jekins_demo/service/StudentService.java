package com.bits.jekins_demo.service;

import com.bits.jekins_demo.enity.Student;
import com.bits.jekins_demo.repository.StudentRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public String createStudent(Student student) {
        studentRepo.save(student);
        log.info("Student created");
        return student.getName();
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepo.getById(id);
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public String deleteStudentById(int id) {
        studentRepo.deleteById(id);
        return "Student deleted with id: " + id;
    }

}
