package com.idat.idatapirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.idatapirest.dto.CursoRequestDTO;
import com.idat.idatapirest.model.Curso;
import com.idat.idatapirest.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository repository;

	@Override
	public void guardarCurso(CursoRequestDTO c) {
		Curso curso = new Curso();
		curso.setIdCurso(c.getIdRequest());
		curso.setDescripcion(c.getDescripcion());
		curso.setCurso(c.getCurso());
		repository.save(curso);
	}

	@Override
	public void eliminarCurso(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void editarCurso(Curso c) {
		repository.saveAndFlush(c);
	}

	@Override
	public List<Curso> listarCurso() {
		return repository.findAll();
	}

	@Override
	public Curso cursoById(Integer id) {
		return repository.findById(id).orElse(null);
	}
}