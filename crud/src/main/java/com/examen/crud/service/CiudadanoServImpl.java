package com.examen.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.crud.model.Ciudadano;
import com.examen.crud.repository.CiudadanoRepository;


@Service
public class CiudadanoServImpl implements CiudadanoService {

	@Autowired
    private CiudadanoRepository ciudadanoRepository;

    @Override
    public List < Ciudadano > getAllCiudadanos() {
        return ciudadanoRepository.findAll();
    }

    @Override
    public void saveCiudadano(Ciudadano ciudadano) {
        this.ciudadanoRepository.save(ciudadano);
    }

    @Override
    public Ciudadano getCiudadanoById(long id) {
        Optional < Ciudadano > optional = ciudadanoRepository.findById(id);
        Ciudadano ciudadano = null;
        if (optional.isPresent()) {
        	ciudadano = optional.get();
        } 
        else {
            throw new RuntimeException(" No se encontró el ciudadano con el id :: " + id);
        }
        return ciudadano;
    }

    @Override
    public void deleteCiudadanoById(long id) {
        this.ciudadanoRepository.deleteById(id);
    }
	
}
