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

import com.flb.ws_etutoring.models.Direccion;
import com.flb.ws_etutoring.models.Usuario;
import com.flb.ws_etutoring.services.DireccionService;

@RestController
public class DireccionController {
    @Autowired
    DireccionService dService;

    @GetMapping("/direcciones")
    List<Direccion> all() {
        return dService.findAll();
    }

    @GetMapping("/direcciones/usuario/{id}")
    List<Direccion> findByUsuario(@PathVariable int id) {
        Usuario u = new Usuario(id);
        return dService.findByUsuario(u);
    }

    @GetMapping("direcciones/{id}")
    Direccion find(@PathVariable int id) {
        Direccion u = dService.findById(id);
        return u;
    }

    @DeleteMapping("/direcciones/{id}")
    void delete(@PathVariable int id) {
        dService.deleteById(id);
    }

    @PostMapping("/direcciones")
    Direccion save(@RequestBody Direccion direccion) {
        return dService.save(direccion);
    }

    @PutMapping("/direcciones/{id}")
    void update(@PathVariable int id, @RequestBody Direccion direccion) {
        dService.update(id, direccion);
    }
}
