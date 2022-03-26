package com.idat.idatapirest.service;

import com.idat.idatapirest.dto.UniversidadRequestDTO;
import com.idat.idatapirest.model.Universidad;

import java.util.List;

public interface UniversidadService {

    public void guardarUniversidad(UniversidadRequestDTO u);
    public void eliminarUniversidad(Integer id);
    public void editarUniversidad(Universidad u);
    public List<Universidad> listarUniversidads();
    public Universidad universidadById(Integer id);

}
