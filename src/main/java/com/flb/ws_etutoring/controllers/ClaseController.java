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

import com.flb.ws_etutoring.models.Clase;
import com.flb.ws_etutoring.services.ClaseService;

@RestController
public class ClaseController {
    @Autowired
    ClaseService cService;

    @GetMapping("/clases")
    List<Clase> all() {
        return cService.findAll();
    }

    @GetMapping("clases/{id}")
    Clase find(@PathVariable int id) {
        Clase u = cService.findById(id);
        return u;
    }

    @DeleteMapping("/clases/{id}")
    void delete(@PathVariable int id) {
        cService.deleteById(id);
    }

    @PostMapping("/clases")
    Clase save(@RequestBody Clase clase) {
        return cService.save(clase);
    }

    @PutMapping("/clases/{id}")
    void update(@PathVariable int id, @RequestBody Clase clase) {
        cService.update(id, clase);
    }
}
