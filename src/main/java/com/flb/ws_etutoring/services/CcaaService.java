package com.flb.ws_etutoring.services;

import java.util.List;

import com.flb.ws_etutoring.models.Ccaa;

public interface CcaaService {
    public List<Ccaa> findAll();

    public Ccaa findById(int id);
}
