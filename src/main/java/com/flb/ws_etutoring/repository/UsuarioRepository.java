package com.flb.ws_etutoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flb.ws_etutoring.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByUsername(String username);
}
