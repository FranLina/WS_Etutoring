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

import com.flb.ws_etutoring.models.Calendario;
import com.flb.ws_etutoring.models.Usuario;
import com.flb.ws_etutoring.services.CalendarioService;

@RestController
public class CalendarioController {

    @Autowired
    CalendarioService cService;

    @GetMapping("/calendarios")
    List<Calendario> all() {
        return cService.findAll();
    }

    @GetMapping("calendarios/{id}")
    Calendario find(@PathVariable int id) {
        Calendario u = cService.findById(id);
        return u;
    }

    @GetMapping("calendarios/profesor/{id}")
    List<Calendario> findByProfesor(@PathVariable int id) {
        Usuario profesor = new Usuario();
        profesor.setId(id);
        List<Calendario> c = cService.findByProfesor(profesor);
        return c;
    }

    @DeleteMapping("/calendarios/{id}")
    void delete(@PathVariable int id) {
        cService.deleteById(id);
    }

    @PostMapping("/calendarios")
    Calendario save(@RequestBody Calendario calendario) {
        return cService.save(calendario);
    }

    @PutMapping("/calendarios/{id}")
    void update(@PathVariable int id, @RequestBody Calendario calendario) {
        cService.update(id, calendario);
    }
}
