package com.idat.idatapirest.controller;

import com.idat.idatapirest.dto.MallaRequestDTO;
import com.idat.idatapirest.model.Malla;
import com.idat.idatapirest.service.MallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/malla/v1")
public class MallaController {
    @Autowired
    private MallaService service;

    @RequestMapping(method = RequestMethod.GET, path = "/listar")
    public ResponseEntity<List<Malla>> listar(){

        return new ResponseEntity<List<Malla>>(service.listarMalla(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/guardar")
    public ResponseEntity<Void> guardar(@RequestBody MallaRequestDTO malla){
        service.guardarMalla(malla);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/listar/{id}")
    public @ResponseBody
    ResponseEntity<Malla> mallaById(@PathVariable Integer id){
        Malla malla = service.mallaById(id);
        if(malla != null) {
            return new ResponseEntity<Malla>(malla, HttpStatus.OK);

        }
        return new ResponseEntity<Malla>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/eliminar/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        Malla malla = service.mallaById(id);
        if(malla != null) {
            service.eliminarMalla(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping(method = RequestMethod.PUT, path = "/editar")
    public ResponseEntity<Void> editar(@RequestBody Malla malla){
        Malla m = service.mallaById(malla.getIdMalla());
        if(m != null) {
            service.editarMalla(malla);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }

}
