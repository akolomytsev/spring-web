package com.geekbrains.springweb.controllers;

import com.geekbrains.springweb.datd.Student;
import com.geekbrains.springweb.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    private StudentRepository studentRepository;

    public MainController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
     public List<Student> getAllStudents(){
        return studentRepository.getAllStudents();

    }

//    // http://localhost:8189/app
//
//
//
//    // http://localhost:8189/add
//
//    @GetMapping("/add")
//    @ResponseBody
//    public int add(@RequestParam int a, @RequestParam(required = false) int b){
//        return a + b;
//    }
//
//
//    // http://localhost:8189/sub
//
//    @GetMapping("/sub")
//    @ResponseBody
//    public int sub(@RequestParam int a, @RequestParam(required = false) int b){
//        return a - b;
//    }
//
//    // http://localhost:8189/div
//
//    @GetMapping("/div")
//    @ResponseBody
//    public int div(@RequestParam int a, @RequestParam(required = false) int b){
//        return a / b;
//    }
//
//    // http://localhost:8189/mul
//
//    @GetMapping("/mul")
//    @ResponseBody
//    public int mul(@RequestParam int a, @RequestParam(required = false) int b){
//        return a * b;
//    }
//
//
//    // http://localhost:8189/add/product/111/info
//
//    @GetMapping("/product/{id}/info")
//    @ResponseBody
//    public String showProductInfo(@PathVariable Long id){
//        return "Product #" + id;
//    }
//
//    // http://localhost:8189/add
//
//    @GetMapping("/students")
//    public  String showStudentsPage(Model model){
//        model.addAttribute("students", studentRepository.getAllStudents());
//        return "students_page";
//    }
//
//    @GetMapping("/students/{id}")
//    public  String showStudentsPage(Model model, @PathVariable Long id){
//        Student student = studentRepository.findById(id);
//        model.addAttribute("student", student);
//        return "students_info_page";
//    }
//
//    @GetMapping("/show_form")
//    public String showFormPage(){
//        return "simple_form";
//    }
//
//    @GetMapping("/stud_add")
//    public String addStudent(@RequestParam Long id, @RequestParam String name){
//        Student student = new Student(id, name);
//        studentRepository.add(student);
//        return "redirect:/students";
//    }


}
