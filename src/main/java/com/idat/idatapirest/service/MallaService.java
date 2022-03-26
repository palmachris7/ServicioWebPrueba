package com.idat.idatapirest.service;

import com.idat.idatapirest.dto.MallaRequestDTO;

import com.idat.idatapirest.model.Malla;

import java.util.List;

public interface MallaService {

    public void guardarMalla(MallaRequestDTO m);
    public void eliminarMalla(Integer id);
    public void editarMalla(Malla m);
    public List<Malla> listarMalla();
    public Malla mallaById(Integer id);

}
