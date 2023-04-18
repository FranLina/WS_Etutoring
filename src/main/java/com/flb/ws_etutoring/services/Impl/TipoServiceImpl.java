package com.flb.ws_etutoring.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Tipo;
import com.flb.ws_etutoring.repository.TipoRepository;
import com.flb.ws_etutoring.services.TipoService;

@Service
public class TipoServiceImpl implements TipoService {

    @Autowired
    TipoRepository tRepository;

    @Override
    public List<Tipo> findAll() {
        return tRepository.findAll();
    }

    @Override
    public Tipo findById(int id) {
        Optional<Tipo> findById = tRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Tipo save(Tipo tipo) {
        return tRepository.save(tipo);
    }

    @Override
    public void update(int id, Tipo tipo) {
        this.findById(id);
        tipo.setId(id);
        tRepository.save(tipo);
    }

    @Override
    public void deleteById(int id) {
        tRepository.deleteById(id);
    }

}
