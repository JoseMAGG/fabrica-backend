package com.example.Fabrica_gr6.services;

import com.example.Fabrica_gr6.models.Course;

import com.example.Fabrica_gr6.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> findAll(){
        //capturar y enviar los elementos de la bas de datos
        return courseRepository.findAll();

    }



    //crear un Nuevo elemento

    public ResponseEntity<Course> save(@RequestBody Course course){

        //guardar
        Course result=courseRepository.save(course);

        return  ResponseEntity.ok(result);
    }




    //buscar segun su id

    public ResponseEntity<Course> findById(@PathVariable String id){
        //usamos siempre un optional para no tratar con excepciones de alcance por id, debido a un id incorrecto
        Optional<Course> optionalCourse=courseRepository.findById(id);
        if(optionalCourse.isPresent())
            //si existe lo devuelvo
            return  ResponseEntity.ok(optionalCourse.get());
        else
            //si no existe debolvemos un 404 con un response entity
            return ResponseEntity.notFound().build();
    }




    //borrar un elemento de la DB

    public ResponseEntity<Course> delete(@PathVariable String id){

        if (!courseRepository.existsById(id)) { //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        courseRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }




    //actualizar un elemento existente

    public ResponseEntity<Course> update(@RequestBody Course course){
        if(course.getCourseCode()==null){ //no le mande un id
            return ResponseEntity.badRequest().build();
        }
        if(!courseRepository.existsById(course.getCourseCode())){ //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        //de lo contrario
        Course result=courseRepository.save(course);
        return ResponseEntity.ok(result);


    }


}
