package com.idat.idatapirest.repository;

import com.idat.idatapirest.model.Malla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MallaRepository extends JpaRepository<Malla,Integer> {
}
