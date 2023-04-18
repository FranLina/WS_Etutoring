package com.flb.ws_etutoring.services;

import java.util.List;

import com.flb.ws_etutoring.models.Materia;

public interface MateriaService {
    public List<Materia> findAll();

    public Materia findById(int id);

    public Materia save(Materia materia);

    public void update(int id, Materia materia);

    public void deleteById(int id);
}
