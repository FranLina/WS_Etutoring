package com.flb.ws_etutoring.services;

import java.util.Date;
import java.util.List;

import com.flb.ws_etutoring.models.Calendario;
import com.flb.ws_etutoring.models.Usuario;

public interface CalendarioService {
    public List<Calendario> findAll();

    public Calendario findById(int id);

    public Calendario findByFechaAndHorariosAndProfesor(Date fecha, String horarios, Usuario profesor);

    public List<Calendario> findByProfesor(Usuario profesor);

    public List<Calendario> findByProfesorAndFecha(Usuario profesor, Date fecha);

    public List<Calendario> findByProfesorAndGreaterThanEqualFecha(Usuario profesor, Date fecha);

    public List<Calendario> findByProfesorAndReservado(Usuario profesor, Boolean reservado);

    public Calendario save(Calendario calendario);

    public void update(int id, Calendario calendario);

    public void deleteById(int id);
}
