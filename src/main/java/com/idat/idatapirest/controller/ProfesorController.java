package com.idat.idatapirest.controller;

import com.idat.idatapirest.dto.ProfesorRequestDTO;
import com.idat.idatapirest.model.Profesor;
import com.idat.idatapirest.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

}
