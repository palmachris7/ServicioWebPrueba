package com.idat.idatapirest.service;

import com.idat.idatapirest.dto.ProfesorRequestDTO;
import com.idat.idatapirest.model.Profesor;
import com.idat.idatapirest.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private ProfesorRepository repository;
    @Override
    public void guardarProfesor(ProfesorRequestDTO p) {
        Profesor profesor = new Profesor();
        profesor.setIdProfesor(p.getIdRequest());
        profesor.setProfesor(p.getProfesor());
        repository.save(profesor);
    }

    @Override
    public void eliminarProfesor(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void editarProfesor(Profesor p) {
        repository.saveAndFlush(p);
    }

    @Override
    public List<Profesor> listarProfesors() {
        return repository.findAll();
    }

    @Override
    public Profesor ProfesorById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
