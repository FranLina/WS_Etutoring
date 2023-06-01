package com.flb.ws_etutoring.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    
    @JsonIgnore
    @OneToMany(mappedBy = "materia")
    private List<Usuario> profesores;

    public Materia(int id) {
        this.id = id;
    }

    public Materia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Usuario> profesores) {
        this.profesores = profesores;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Materia other = (Materia) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
