package com.flb.ws_etutoring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flb.ws_etutoring.models.Provincias;
import com.flb.ws_etutoring.models.Ccaa;
import com.flb.ws_etutoring.services.ProvinciasService;

@RestController
public class ProvinciaController {
    @Autowired
    ProvinciasService pService;

    @GetMapping("/provincias")
    List<Provincias> findByAll() {
        return pService.findAll();
    }

    @GetMapping("provincias/{id}")
    Provincias find(@PathVariable int id) {
        Provincias p = pService.findById(id);
        return p;
    }

    @GetMapping("/provincias/ccaa/{id}")
    List<Provincias> findByCcaa(@PathVariable int id) {
        return pService.findByCcaa(new Ccaa(id));
    }
}
