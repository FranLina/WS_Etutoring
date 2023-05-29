package com.flb.ws_etutoring.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.ws_etutoring.models.Calendario;
import com.flb.ws_etutoring.models.Usuario;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Integer> {

    List<Calendario> findByProfesor(Usuario profesor);

    List<Calendario> findByProfesorAndFecha(Usuario profesor, Date fecha);

    List<Calendario> findByProfesorAndReservado(Usuario profesor, Boolean reservado);

    Optional<Calendario> findByFechaAndHorariosAndProfesor(Date fecha, String horarios, Usuario profesor);
}
