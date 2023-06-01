package com.flb.ws_etutoring.services;

import java.util.List;

import com.flb.ws_etutoring.models.Municipios;
import com.flb.ws_etutoring.models.Provincias;

public interface MunicipiosService {
    public List<Municipios> findAll();

    public Municipios findById(int id);

    public List<Municipios> findByProvincia(Provincias provincia);
}
