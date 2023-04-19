package com.example.Fabrica_gr6.services;

import com.example.Fabrica_gr6.models.Decano;

import com.example.Fabrica_gr6.repositories.DecanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class DecanoService {
    @Autowired
    DecanoRepository decanoRepository;

    public List<Decano> findAll(){
        //capturar y enviar los elementos de la bas de datos
        return decanoRepository.findAll();

    }



    //crear un Nuevo elemento

    public ResponseEntity<Decano> save(@RequestBody Decano decano){

        //guardar
        Decano result=decanoRepository.save(decano);

        return  ResponseEntity.ok(result);
    }




    //buscar segun su id

    public ResponseEntity<Decano> findById(@PathVariable Integer id){
        //usamos siempre un optional para no tratar con excepciones de alcance por id, debido a un id incorrecto
        Optional<Decano> optionalDecano=decanoRepository.findById(id);
        if(optionalDecano.isPresent())
            //si existe lo devuelvo
            return  ResponseEntity.ok(optionalDecano.get());
        else
            //si no existe debolvemos un 404 con un response entity
            return ResponseEntity.notFound().build();
    }




    //borrar un elemento de la DB

    public ResponseEntity<Decano> delete(@PathVariable Integer id){

        if (!decanoRepository.existsById(id)) { //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        decanoRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }




    //actualizar un elemento existente

    public ResponseEntity<Decano> update(@RequestBody Decano decano){
        if(decano.getIdPersona()==null){ //no le mande un id
            return ResponseEntity.badRequest().build();
        }
        if(!decanoRepository.existsById(decano.getIdPersona())){ //si el Id NO existe (NUMEO MUY GRANDE)
            return ResponseEntity.notFound().build();
        }
        //de lo contrario
        Decano result=decanoRepository.save(decano);
        return ResponseEntity.ok(result);


    }


}
