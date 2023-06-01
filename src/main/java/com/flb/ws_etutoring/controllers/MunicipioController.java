package com.flb.ws_etutoring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flb.ws_etutoring.models.Municipios;
import com.flb.ws_etutoring.models.Provincias;
import com.flb.ws_etutoring.services.MunicipiosService;

@RestController
public class MunicipioController {
    @Autowired
    MunicipiosService mService;

    @GetMapping("/municipios")
    List<Municipios> findByAll() {
        return mService.findAll();
    }

    @GetMapping("municipios/{id}")
    Municipios find(@PathVariable int id) {
        Municipios m = mService.findById(id);
        return m;
    }

    @GetMapping("/municipios/provincia/{id}")
    List<Municipios> findByProvincia(@PathVariable int id) {
        return mService.findByProvincia(new Provincias(id));
    }
}
