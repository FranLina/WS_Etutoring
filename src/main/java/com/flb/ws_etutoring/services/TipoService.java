package com.flb.ws_etutoring.services;

import java.util.List;

import com.flb.ws_etutoring.models.Tipo;

public interface TipoService {
    public List<Tipo> findAll();

    public Tipo findById(int id);

    public Tipo save(Tipo tipo);

    public void update(int id, Tipo tipo);

    public void deleteById(int id);
}
