package com.idat.idatapirest.repository;


import com.idat.idatapirest.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CursoRepository extends JpaRepository<Curso,Integer> {

	

}
