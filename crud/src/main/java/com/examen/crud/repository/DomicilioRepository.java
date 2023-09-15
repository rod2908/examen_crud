package com.examen.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.crud.model.Domicilio;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long>{
	
}
