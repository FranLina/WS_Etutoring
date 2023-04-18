package com.flb.ws_etutoring.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Valoracion;
import com.flb.ws_etutoring.repository.ValoracionRepository;
import com.flb.ws_etutoring.services.ValoracionService;

@Service
public class ValoracionServiceImpl implements ValoracionService {

    @Autowired
    ValoracionRepository vRepository;

    @Override
    public List<Valoracion> findAll() {
        return vRepository.findAll();
    }

    @Override
    public Valoracion findById(int id) {
        Optional<Valoracion> findById = vRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Valoracion save(Valoracion valoracion) {
        return vRepository.save(valoracion);
    }

    @Override
    public void update(int id, Valoracion valoracion) {
        this.findById(id);
        valoracion.setId(id);
        vRepository.save(valoracion);
    }

    @Override
    public void deleteById(int id) {
        vRepository.deleteById(id);
    }

}
