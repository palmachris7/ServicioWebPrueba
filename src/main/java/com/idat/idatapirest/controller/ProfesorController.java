package com.idat.idatapirest.controller;


import com.idat.idatapirest.dto.ProfesorRequestDTO;

import com.idat.idatapirest.model.Profesor;

import com.idat.idatapirest.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor/v1")
public class ProfesorController {
    @Autowired
    private ProfesorService service;

    @RequestMapping(method = RequestMethod.GET, path = "/listar")
    public ResponseEntity<List<Profesor>> listar(){

        return new ResponseEntity<List<Profesor>>(service.listarProfesors(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/guardar")
    public ResponseEntity<Void> guardar(@RequestBody ProfesorRequestDTO profesor){
        service.guardarProfesor(profesor);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/listar/{id}")
    public @ResponseBody
    ResponseEntity<Profesor> profesorById(@PathVariable Integer id){
        Profesor profesor = service.ProfesorById(id);
        if(profesor != null) {
            return new ResponseEntity<Profesor>(profesor, HttpStatus.OK);

        }
        return new ResponseEntity<Profesor>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        Profesor profesor = service.ProfesorById(id);
        if(profesor != null) {
            service.eliminarProfesor(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping(method = RequestMethod.PUT, path = "/editar")
    public ResponseEntity<Void> editar(@RequestBody Profesor profesor){
        Profesor p = service.ProfesorById(profesor.getIdProfesor());
        if(p != null) {
            service.editarProfesor(profesor);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }


}
