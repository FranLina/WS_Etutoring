package com.flb.ws_etutoring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.ws_etutoring.models.Direccion;
import com.flb.ws_etutoring.models.Usuario;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion, Integer> {

    public List<Direccion> findByUsuario(Usuario usuario);
}
