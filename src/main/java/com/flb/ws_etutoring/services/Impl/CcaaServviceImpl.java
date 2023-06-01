package com.flb.ws_etutoring.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Ccaa;
import com.flb.ws_etutoring.repository.CcaaRepository;
import com.flb.ws_etutoring.services.CcaaService;

@Service
public class CcaaServviceImpl implements CcaaService {

    @Autowired
    CcaaRepository ccaaRepository;

    @Override
    public List<Ccaa> findAll() {
        return ccaaRepository.findAll();
    }

    @Override
    public Ccaa findById(int id) {
        Optional<Ccaa> findById = ccaaRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

}
