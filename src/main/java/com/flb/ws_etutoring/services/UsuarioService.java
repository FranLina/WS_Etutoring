package com.flb.ws_etutoring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Usuario;
import com.flb.ws_etutoring.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository uRepository;

    public Usuario createUser(Usuario user) {
        return uRepository.save(user);
    }

    public Usuario updateUser(Usuario user) {

        if (user.getFotoPerfil() == null || user.getFotoPerfil().length == 0) {
            Usuario userAux = getUser(user.getId());
            user.setFotoPerfil(userAux.getFotoPerfil());
        }

        return uRepository.save(user);
    }

    public void deleteUser(int userId) {
        uRepository.deleteById(userId);
    }

    public Usuario getUser(int userId) {
        Usuario u = uRepository.findById(userId).orElse(null);
        return u;
    }

    public Usuario getByNombre(String username) {
        return uRepository.findByUsername(username);
    }

    public List<Usuario> getAllUsers() {
        return uRepository.findAll();
    }
}
