package com.flb.ws_etutoring.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.ws_etutoring.models.Clase;
import com.flb.ws_etutoring.models.Usuario;

@Repository
public interface ClaseRepository extends JpaRepository<Clase, Integer> {
    List<Clase> findByAlumno(Usuario alumno);

    List<Clase> findByProfesorAndValoracionNotNull(Usuario profesor);

    List<Clase> findByProfesor(Usuario profesor);

    Optional<Clase> findByFechaAndHorariosAndProfesor(Date fecha, String horarios, Usuario profesor);

    Optional<Clase> findByFechaAndHorariosAndAlumno(Date fecha, String horarios, Usuario alumno);

    List<Clase> findByProfesorAndFecha(Usuario profesor, Date fecha);
}
