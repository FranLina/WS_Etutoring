package com.flb.ws_etutoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flb.ws_etutoring.models.Materia;
@Repository
public interface MateriaRepository extends JpaRepository<Materia, Integer> {

}
