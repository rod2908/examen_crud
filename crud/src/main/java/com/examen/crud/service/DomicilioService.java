

package com.examen.crud.service;

import java.util.List;
import com.examen.crud.model.Domicilio;

public interface DomicilioService {

    List < Domicilio > getAllDomicilios();
    void saveDomicilio(Domicilio domicilio);
    Domicilio getDomicilioById(long id);
    void deleteDomicilioById(long id);
}
