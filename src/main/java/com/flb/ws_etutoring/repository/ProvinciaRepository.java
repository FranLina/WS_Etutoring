package com.flb.ws_etutoring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.ws_etutoring.models.Ccaa;
import com.flb.ws_etutoring.models.Provincias;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincias, Integer> {
    List<Provincias> findByCcaa(Ccaa ccaa);

    List<Provincias> findByCcaaOrderByProvinciaAsc(Ccaa ccaa);

    List<Provincias> findAllByOrderByProvinciaAsc();

}
