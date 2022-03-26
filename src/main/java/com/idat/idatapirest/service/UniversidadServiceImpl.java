package com.idat.idatapirest.service;

import com.idat.idatapirest.dto.UniversidadRequestDTO;

import com.idat.idatapirest.model.Universidad;
import com.idat.idatapirest.repository.UniversidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UniversidadServiceImpl implements UniversidadService {

    @Autowired
    private UniversidadRepository repository;
    @Override
    public void guardarUniversidad(UniversidadRequestDTO u) {
        Universidad universidad = new Universidad();
        universidad.setIdUniversidad(u.getIdRequest());
        universidad.setUniversidad(u.getUniversidad());
        repository.save(universidad);

    }

    @Override
    public void eliminarUniversidad(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void editarUniversidad(Universidad u) {
        repository.saveAndFlush(u);
    }

    @Override
    public List<Universidad> listarUniversidads() {
        return repository.findAll();
    }

    @Override
    public Universidad universidadById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
