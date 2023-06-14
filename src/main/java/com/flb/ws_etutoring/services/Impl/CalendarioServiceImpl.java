package com.flb.ws_etutoring.services.Impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Calendario;
import com.flb.ws_etutoring.models.Usuario;
import com.flb.ws_etutoring.repository.CalendarioRepository;
import com.flb.ws_etutoring.services.CalendarioService;

@Service
public class CalendarioServiceImpl implements CalendarioService {

    @Autowired
    CalendarioRepository cRepository;

    @Override
    public List<Calendario> findAll() {
        return cRepository.findAll();
    }

    @Override
    public Calendario findById(int id) {
        Optional<Calendario> findById = cRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Calendario findByFechaAndHorariosAndProfesor(Date fecha, String horarios, Usuario profesor) {
        Optional<Calendario> findByFechaAndHorarios = cRepository.findByFechaAndHorariosAndProfesor(fecha, horarios,
                profesor);
        if (findByFechaAndHorarios != null) {
            return findByFechaAndHorarios.get();
        }
        return null;
    }

    @Override
    public List<Calendario> findByProfesorAndFecha(Usuario profesor, Date fecha) {
        return cRepository.findByProfesorAndFecha(profesor, fecha);
    }

    @Override
    public List<Calendario> findByProfesorAndGreaterThanEqualFecha(Usuario profesor, Date fecha) {
        return cRepository.findByProfesorAndFechaGreaterThanEqual(profesor, fecha);
    }

    @Override
    public List<Calendario> findByProfesor(Usuario profesor) {
        return cRepository.findByProfesor(profesor);
    }

    @Override
    public List<Calendario> findByProfesorAndReservado(Usuario profesor, Boolean reservado) {
        return cRepository.findByProfesorAndReservado(profesor, reservado);
    }

    @Override
    public Calendario save(Calendario calendario) {
        return cRepository.save(calendario);
    }

    @Override
    public void update(int id, Calendario calendario) {
        this.findById(id);
        calendario.setId(id);
        cRepository.save(calendario);
    }

    @Override
    public void deleteById(int id) {
        cRepository.deleteById(id);
    }

}
