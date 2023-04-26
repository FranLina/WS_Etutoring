package com.flb.ws_etutoring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.ws_etutoring.models.Materia;
import com.flb.ws_etutoring.models.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByUsername(String username);
    List<Usuario> findByMateria(Materia materia);
}
