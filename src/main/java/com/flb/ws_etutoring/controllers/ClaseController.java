package com.flb.ws_etutoring.controllers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
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
import com.flb.ws_etutoring.models.Usuario;
import com.flb.ws_etutoring.services.ClaseService;
import com.flb.ws_etutoring.services.UsuarioService;

@RestController
public class ClaseController {
    @Autowired
    ClaseService cService;

    @Autowired
    UsuarioService uService;

    @GetMapping("/clases")
    List<Clase> all() {
        return cService.findAll();
    }

    @GetMapping("/clases/usuario/{id}")
    List<Clase> findByAlumno(@PathVariable int id) {
        Usuario alumno = new Usuario();
        alumno.setId(id);
        return cService.findByAlumno(alumno);
    }

    @GetMapping("/clases/profesor/{id}")
    List<Clase> findByProfesor(@PathVariable int id) {
        Usuario profesor = new Usuario();
        profesor.setId(id);
        return cService.findByProfesor(profesor);
    }

    @GetMapping("/clases/cancelar/{year}/{month}/{day}/{horarios}/{id}")
    Clase findByFechaAndHorarios(@PathVariable int year,
            @PathVariable int month,
            @PathVariable int day,
            @PathVariable String horarios,
            @PathVariable int id) {

        Usuario profesor = uService.getUser(id);
        LocalDate dia = LocalDate.of(year, month, day);

        Clase c = cService.findByFechaAndHorariosAndProfesor(Date
                .from(dia.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()), horarios, profesor);
        return c;
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
