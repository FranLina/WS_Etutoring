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

import com.flb.ws_etutoring.models.Usuario;
import com.flb.ws_etutoring.services.UsuarioService;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService uService;

    @GetMapping("/usuarios")
    List<Usuario> all() {
        return uService.getAllUsers();
    }

    @GetMapping("usuarios/{id}")
    Usuario find(@PathVariable int id) {
        Usuario u = uService.getUser(id);
        return u;
    }

    @DeleteMapping("/usuarios/{id}")
    void delete(@PathVariable int id) {
        uService.deleteUser(id);
    }

    @PostMapping("/usuarios")
    Usuario save(@RequestBody Usuario alumno) {
        return uService.createUser(alumno);
    }

    @PutMapping("/usuarios/{id}")
    void update(@RequestBody Usuario alumno) {
        uService.updateUser(alumno);
    }
}
