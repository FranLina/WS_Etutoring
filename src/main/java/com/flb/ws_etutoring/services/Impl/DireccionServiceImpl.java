package com.flb.ws_etutoring.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flb.ws_etutoring.models.Direccion;
import com.flb.ws_etutoring.models.Usuario;
import com.flb.ws_etutoring.repository.DireccionRepository;
import com.flb.ws_etutoring.services.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService {

    @Autowired
    DireccionRepository dRepository;

    @Override
    public List<Direccion> findAll() {
        return dRepository.findAll();
    }

    @Override
    public Direccion findById(int id) {
        Optional<Direccion> findById = dRepository.findById(id);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Direccion save(Direccion direccion) {
        return dRepository.save(direccion);
    }

    @Override
    public void update(int id, Direccion direccion) {
        this.findById(id);
        direccion.setId(id);
        dRepository.save(direccion);
    }

    @Override
    public void deleteById(int id) {
        // dRepository.deleteDireccionUsuario(id);
        dRepository.deleteById(id);
    }

    @Override
    public List<Direccion> findByUsuario(Usuario usuario) {
        return dRepository.findByUsuario(usuario);
    }

}
