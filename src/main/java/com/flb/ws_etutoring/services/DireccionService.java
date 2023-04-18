package com.flb.ws_etutoring.services;

import java.util.List;

import com.flb.ws_etutoring.models.Direccion;
import com.flb.ws_etutoring.models.Usuario;

public interface DireccionService {
    public List<Direccion> findAll();

    public List<Direccion> findByUsuario(Usuario usuario);

    public Direccion findById(int id);

    public Direccion save(Direccion direccion);

    public void update(int id, Direccion direccion);

    public void deleteById(int id);
}
