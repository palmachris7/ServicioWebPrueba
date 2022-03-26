package com.idat.idatapirest.controller;


import com.idat.idatapirest.dto.UniversidadRequestDTO;

import com.idat.idatapirest.model.Universidad;

import com.idat.idatapirest.service.UniversidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/universidad/v1")
public class UniversidadController {
    @Autowired
    private UniversidadService service;

    @RequestMapping(method = RequestMethod.GET, path = "/listar")
    public ResponseEntity<List<Universidad>> listar(){

        return new ResponseEntity<List<Universidad>>(service.listarUniversidads(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/guardar")
    public ResponseEntity<Void> guardar(@RequestBody UniversidadRequestDTO universidad){
        service.guardarUniversidad(universidad);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/listar/{id}")
    public @ResponseBody
    ResponseEntity<Universidad> universidadById(@PathVariable Integer id){
        Universidad universidad = service.universidadById(id);
        if(universidad != null) {
            return new ResponseEntity<Universidad>(universidad, HttpStatus.OK);

        }
        return new ResponseEntity<Universidad>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        Universidad universidad = service.universidadById(id);
        if(universidad != null) {
            service.eliminarUniversidad(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping(method = RequestMethod.PUT, path = "/editar")
    public ResponseEntity<Void> editar(@RequestBody Universidad universidad){
        Universidad u = service.universidadById(universidad.getIdUniversidad());
        if(u != null) {
            service.editarUniversidad(universidad);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }
}
