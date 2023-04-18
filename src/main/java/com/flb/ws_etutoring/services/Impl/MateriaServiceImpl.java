package com.flb.ws_etutoring.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Materia;
import com.flb.ws_etutoring.repository.MateriaRepository;
import com.flb.ws_etutoring.services.MateriaService;

@Service
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    MateriaRepository mRepository;

    @Override
    public List<Materia> findAll() {
        return mRepository.findAll();
    }

    @Override
    public Materia findById(int id) {
        Optional<Materia> findById = mRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Materia save(Materia materia) {
        return mRepository.save(materia);
    }

    @Override
    public void update(int id, Materia materia) {
        this.findById(id);
        materia.setId(id);
        mRepository.save(materia);
    }

    @Override
    public void deleteById(int id) {
        mRepository.deleteById(id);
    }

}
