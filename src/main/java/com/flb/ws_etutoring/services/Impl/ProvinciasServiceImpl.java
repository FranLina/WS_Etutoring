package com.flb.ws_etutoring.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Ccaa;
import com.flb.ws_etutoring.models.Provincias;
import com.flb.ws_etutoring.repository.ProvinciaRepository;
import com.flb.ws_etutoring.services.ProvinciasService;

@Service
public class ProvinciasServiceImpl implements ProvinciasService {

    @Autowired
    ProvinciaRepository pRepository;

    @Override
    public List<Provincias> findAll() {
        return pRepository.findAllByOrderByProvinciaAsc();
    }

    @Override
    public Provincias findById(int id) {
        Optional<Provincias> findById = pRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Provincias> findByCcaa(Ccaa ccaa) {
        return pRepository.findByCcaaOrderByProvinciaAsc(ccaa);
    }

}
