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
        Malla malla = new Malla();
        malla.setIdMalla(m.getIdRequest());
        malla.setAño(m.getAño());
        repository.save(malla);
    }

    @Override
    public void eliminarMalla(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void editarMalla(Malla m) {
        repository.saveAndFlush(m);
    }

    @Override
    public List<Malla> listarMalla() {
        return repository.findAll();
    }

    @Override
    public Malla mallaById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
