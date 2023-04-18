package com.flb.ws_etutoring.services;

import java.util.List;

import com.flb.ws_etutoring.models.Valoracion;

public interface ValoracionService {
    public List<Valoracion> findAll();

    public Valoracion findById(int id);

    public Valoracion save(Valoracion valoracion);

    public void update(int id, Valoracion valoracion);

    public void deleteById(int id);
}
