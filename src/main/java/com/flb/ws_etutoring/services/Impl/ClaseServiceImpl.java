package com.flb.ws_etutoring.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Clase;
import com.flb.ws_etutoring.models.Usuario;
import com.flb.ws_etutoring.repository.ClaseRepository;
import com.flb.ws_etutoring.services.ClaseService;

@Service
public class ClaseServiceImpl implements ClaseService {

    @Autowired
    ClaseRepository cRepository;

    @Override
    public List<Clase> findAll() {
        return cRepository.findAll();
    }

    @Override
    public List<Clase> findByAlumno(Usuario alumno) {
        return cRepository.findByAlumno(alumno);
    }

    @Override
    public Clase findById(int id) {
        Optional<Clase> findById = cRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Clase save(Clase clase) {
        return cRepository.save(clase);
    }

    @Override
    public void update(int id, Clase clase) {
        this.findById(id);
        clase.setId(id);
        cRepository.save(clase);
    }

    @Override
    public void deleteById(int id) {
        cRepository.deleteById(id);
    }

}
