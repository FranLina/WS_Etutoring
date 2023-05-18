package com.flb.ws_etutoring.services;

import java.util.List;

import com.flb.ws_etutoring.models.Clase;
import com.flb.ws_etutoring.models.Usuario;

public interface ClaseService {
    public List<Clase> findAll();

    public List<Clase> findByAlumno(Usuario alumno);

    public List<Clase> findByProfesor(Usuario profesor);

    public Clase findById(int id);

    public Clase save(Clase clase);

    public void update(int id, Clase clase);

    public void deleteById(int id);
}
