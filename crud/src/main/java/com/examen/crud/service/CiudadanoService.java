package com.examen.crud.service;

import java.util.List;
import com.examen.crud.model.Ciudadano;

public interface CiudadanoService {

    List < Ciudadano > getAllCiudadanos();
    void saveCiudadano(Ciudadano ciudadano);
    Ciudadano getCiudadanoById(long id);
    void deleteCiudadanoById(long id);
}
