package com.flb.ws_etutoring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.ws_etutoring.models.Municipios;
import com.flb.ws_etutoring.models.Provincias;

@Repository
public interface MunicipiosRepository extends JpaRepository<Municipios, Integer> {
    List<Municipios> findByProvincia(Provincias provincia);

    List<Municipios> findAllByOrderByMunicipioAsc();

    List<Municipios> findByProvinciaOrderByMunicipioAsc(Provincias provincia);
}
