

package com.examen.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.examen.crud.model.Domicilio;
import com.examen.crud.repository.DomicilioRepository;


@Service
public class DomicilioServImpl implements DomicilioService {

	@Autowired
    private DomicilioRepository domicilioRepository;

    @Override
    public List < Domicilio > getAllDomicilios() {
        return domicilioRepository.findAll();
    }

    @Override
    public void saveDomicilio(Domicilio domicilio) {
        this.domicilioRepository.save(domicilio);
    }

    @Override
    public Domicilio getDomicilioById(long id) {
        Optional < Domicilio > optional = domicilioRepository.findById(id);
        Domicilio domicilio = null;
        if (optional.isPresent()) {
        	domicilio = optional.get();
        } 
        else {
            throw new RuntimeException(" No se encontró el domicilio del ciudadano con el id :: " + id);
        }
        return domicilio;
    }

    @Override
    public void deleteDomicilioById(long id) {
        this.domicilioRepository.deleteById(id);
    }
	
}