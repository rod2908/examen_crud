package com.examen.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.crud.model.Ciudadano;

@Repository
public interface CiudadanoRepository extends JpaRepository<Ciudadano, Long>{
	
}
