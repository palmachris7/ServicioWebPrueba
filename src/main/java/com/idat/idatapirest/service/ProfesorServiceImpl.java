package com.idat.idatapirest.service;

import com.idat.idatapirest.dto.ProfesorRequestDTO;
import com.idat.idatapirest.model.Profesor;
import com.idat.idatapirest.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Override
    public void guardarProfesor(ProfesorRequestDTO p) {

    }

    @Override
    public void eliminarProfesor(Integer id) {

    }

    @Override
    public void editarProfesor(Profesor p) {

    }

    @Override
    public List<Profesor> listarProfesors() {
        return null;
    }

    @Override
    public Profesor ProfesorById(Integer id) {
        return null;
    }
}
