package com.flb.ws_etutoring.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Municipios;
import com.flb.ws_etutoring.models.Provincias;
import com.flb.ws_etutoring.repository.MunicipiosRepository;
import com.flb.ws_etutoring.services.MunicipiosService;

@Service
public class MunicipiosServiceImpl implements MunicipiosService {
    @Autowired
    MunicipiosRepository mRepository;

    @Override
    public List<Municipios> findAll() {
        return mRepository.findAllByOrderByMunicipioAsc();
    }

    @Override
    public Municipios findById(int id) {
        Optional<Municipios> findById = mRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Municipios> findByProvincia(Provincias provincia) {
        return mRepository.findByProvinciaOrderByMunicipioAsc(provincia);
    }

}
