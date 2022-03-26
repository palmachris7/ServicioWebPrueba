package com.idat.idatapirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatapirest.dto.CursoRequestDTO;
import com.idat.idatapirest.model.Curso;
import com.idat.idatapirest.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {


	@Override
	public void guardarCurso(CursoRequestDTO p) {

	}

	@Override
	public void eliminarCurso(Integer id) {

	}

	@Override
	public void editarCurso(Curso p) {

	}

	@Override
	public List<Curso> listarCurso() {
		return null;
	}

	@Override
	public Curso cursoById(Integer id) {
		return null;
	}
}