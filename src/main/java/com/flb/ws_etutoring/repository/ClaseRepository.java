package com.flb.ws_etutoring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.ws_etutoring.models.Clase;
import com.flb.ws_etutoring.models.Usuario;

@Repository
public interface ClaseRepository extends JpaRepository<Clase, Integer> {
    List<Clase> findByAlumno(Usuario alumno);

    List<Clase> findByProfesorAndValoracionNotNull(Usuario profesor);
}
