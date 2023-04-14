package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.Course;
import com.example.Fabrica_gr6.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    //atributos

    @Autowired
    CourseService courseService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/courses")
    public List<Course> findAll(){
        return courseService.findAll();

    }



    @PostMapping("/apicourses")
    public ResponseEntity<Course> save(@RequestBody Course course){

        return courseService.save(course);
    }




    @GetMapping("/api/courses/{id}")
    public ResponseEntity<Course> findById(@PathVariable String id){
        return courseService.findById(id);
    }




    @DeleteMapping("/api/courses/{id}")
    public ResponseEntity<Course> delete(@PathVariable String id){
        return courseService.delete(id);

    }




    @PutMapping("/api/courses")
    public ResponseEntity<Course> update(@RequestBody Course course){
        return courseService.update(course);

    }


}

