package com.idat.idatapirest.repository;

import com.idat.idatapirest.model.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad,Integer> {
}
