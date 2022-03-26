package com.idat.idatapirest.service;
import com.idat.idatapirest.dto.MallaRequestDTO;
import com.idat.idatapirest.model.Malla;
import com.idat.idatapirest.repository.MallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MallaServiceImpl implements MallaService {

    @Autowired
    private MallaRepository repository;
    @Override
    public void guardarMalla(MallaRequestDTO m) {

    }

    @Override
    public void eliminarMalla(Integer id) {

    }

    @Override
    public void editarMalla(Malla m) {

    }

    @Override
    public List<Malla> listarMalla() {
        return null;
    }

    @Override
    public Malla mallaById(Integer id) {
        return null;
    }
}
