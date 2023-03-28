package com.flb.ws_etutoring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flb.ws_etutoring.models.Usuario;
import com.flb.ws_etutoring.repository.TipoRepository;
import com.flb.ws_etutoring.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository uRepository;

    @Autowired
    private TipoRepository tRepository;

    public Usuario createUser(Usuario user) {
        return uRepository.save(user);
    }

    public Usuario updateUser(Usuario user) {
        return uRepository.save(user);
    }

    public void deleteUser(int userId) {
        uRepository.deleteById(userId);
    }

    public Usuario getUser(int userId) {
        return uRepository.findById(userId).orElse(null);
    }

    public Usuario getByNombre(String username) {
        return uRepository.findByUsername(username);
    }

    public List<Usuario> getAllUsers() {
        return uRepository.findAll();
    }
}
