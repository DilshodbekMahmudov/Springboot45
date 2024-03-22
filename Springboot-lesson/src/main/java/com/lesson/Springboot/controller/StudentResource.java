//package com.lesson.Springboot.controller;
//
//import com.lesson.Springboot.model.Student;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/api")
//public class StudentResource {
//
//
//
////    @PostMapping("/students")
////    public ResponseEntity create(@RequestBody Student student){
////        return ResponseEntity.ok(student);
////    }
//
//    @PutMapping("/students")
//    public ResponseEntity update(@RequestBody Student student){
//        student.setLastName("Saidov");
//        return ResponseEntity.ok(student);
//    }
//
//    @PutMapping("/students/{id}")
//    public ResponseEntity update2(@PathVariable Long id,
//                                  @RequestBody Student student){
//        student.setLastName("Saidov");
//        student.setId(id);
//        return ResponseEntity.ok(student);
//    }
//
//    @GetMapping("/students/{id}")
//    public ResponseEntity getOne(@PathVariable Long id){
//        Student student = new Student();
//        student.setId(id);
//        return ResponseEntity.ok(student);
//    }
//
//    @GetMapping("/students")
//    public ResponseEntity getAll(@RequestParam Long id,
//                                 @RequestParam String name,
//                                 @RequestParam String lastName,
//                                 @RequestParam Integer age){
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(id,name,lastName,age));
//        students.add(new Student(3L,"Shaxzod","Oxunov",34));
//        return ResponseEntity.ok(students);
//    }
//
//    @DeleteMapping("/students/{id}")
//    public ResponseEntity delete(@PathVariable Long id){
//        return ResponseEntity.ok("Ma'lumot o'chirildi");
//    }
//
//
//}
