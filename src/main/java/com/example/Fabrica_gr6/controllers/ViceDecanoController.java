package com.example.Fabrica_gr6.controllers;

import com.example.Fabrica_gr6.models.ViceDecano;
import com.example.Fabrica_gr6.services.ViceDecanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ViceDecanoController {
    //atributos

    @Autowired
    ViceDecanoService viceDecanoService;





    //recordemos que el service(-->repository) es quien contiene las cualidades se aplicarsele "QUERYS" por ende lo nesesitamos para poder "usarlos"





//CRUD sobre la entidad

    @GetMapping("/api/viceDecanos")
    public List<ViceDecano> findAll(){
        //capturar y enviar los libros de la bas de datos
        return viceDecanoService.findAll();

    }



    @PostMapping("/api/viceDecanos")
    public ResponseEntity<ViceDecano> save(@RequestBody ViceDecano viceDecano){

        return viceDecanoService.save(viceDecano);
    }




    @GetMapping("/api/viceDecanos/{id}")
    public ResponseEntity<ViceDecano> findById(@PathVariable Integer id){
        return viceDecanoService.findById(id);
    }




    @DeleteMapping("/api/viceDecanos/{id}")
    public ResponseEntity<ViceDecano> delete(@PathVariable Integer id){
        return viceDecanoService.delete(id);

    }




    @PutMapping("/api/viceDecanos")
    public ResponseEntity<ViceDecano> update(@RequestBody ViceDecano viceDecano){
        return viceDecanoService.update(viceDecano);

    }


}
