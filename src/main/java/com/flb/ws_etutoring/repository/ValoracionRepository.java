package com.flb.ws_etutoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.ws_etutoring.models.Valoracion;
@Repository
public interface ValoracionRepository extends JpaRepository<Valoracion, Integer> {

}
