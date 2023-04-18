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

import com.flb.ws_etutoring.models.Materia;
import com.flb.ws_etutoring.services.MateriaService;

@RestController
public class MateriaController {
    @Autowired
    MateriaService mService;

    @GetMapping("/materias")
    List<Materia> all() {
        return mService.findAll();
    }

    @GetMapping("materias/{id}")
    Materia find(@PathVariable int id) {
        Materia u = mService.findById(id);
        return u;
    }

    @DeleteMapping("/materias/{id}")
    void delete(@PathVariable int id) {
        mService.deleteById(id);
    }

    @PostMapping("/materias")
    Materia save(@RequestBody Materia materia) {
        return mService.save(materia);
    }

    @PutMapping("/materias/{id}")
    void update(@PathVariable int id, @RequestBody Materia materia) {
        mService.update(id, materia);
    }
}
