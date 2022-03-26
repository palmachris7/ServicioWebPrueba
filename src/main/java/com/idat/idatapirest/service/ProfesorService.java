package com.idat.idatapirest.service;

import com.idat.idatapirest.dto.ProfesorRequestDTO;
import com.idat.idatapirest.model.Profesor;


import java.util.List;

public interface ProfesorService {
    public void guardarProfesor(ProfesorRequestDTO p);
    public void eliminarProfesor(Integer id);
    public void editarProfesor(Profesor p);
    public List<Profesor> listarProfesors();
    public Profesor ProfesorById(Integer id);
}
