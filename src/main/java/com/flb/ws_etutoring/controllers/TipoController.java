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

import com.flb.ws_etutoring.models.Tipo;
import com.flb.ws_etutoring.services.TipoService;

@RestController
public class TipoController {
    @Autowired
    TipoService tService;

    @GetMapping("/tipos")
    List<Tipo> all() {
        return tService.findAll();
    }

    @GetMapping("tipos/{id}")
    Tipo find(@PathVariable int id) {
        Tipo u = tService.findById(id);
        return u;
    }

    @DeleteMapping("/tipos/{id}")
    void delete(@PathVariable int id) {
        tService.deleteById(id);
    }

    @PostMapping("/tipos")
    Tipo save(@RequestBody Tipo tipo) {
        return tService.save(tipo);
    }

    @PutMapping("/tipos/{id}")
    void update(@PathVariable int id, @RequestBody Tipo tipo) {
        tService.update(id, tipo);
    }
}
