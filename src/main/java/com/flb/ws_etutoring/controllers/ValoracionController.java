package com.flb.ws_etutoring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flb.ws_etutoring.models.Valoracion;
import com.flb.ws_etutoring.services.ValoracionService;

@RestController
public class ValoracionController {

    @Autowired
    ValoracionService vService;

    @GetMapping("/valoraciones")
    List<Valoracion> all() {
        return vService.findAll();
    }

    @GetMapping("valoraciones/{id}")
    Valoracion find(@PathVariable int id) {
        Valoracion u = vService.findById(id);
        return u;
    }

    @DeleteMapping("/valoraciones/{id}")
    void delete(@PathVariable int id) {
        vService.deleteById(id);
    }

    @PostMapping("/valoraciones")
    Valoracion save(@RequestBody Valoracion valoracion) {
        return vService.save(valoracion);
    }

    @PutMapping("/valoraciones/{id}")
    void update(@PathVariable int id, @RequestBody Valoracion valoracion) {
        vService.update(id, valoracion);
    }
}
