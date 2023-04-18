package com.flb.ws_etutoring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Valoracion {
    @Id
    @GeneratedValue
    private int id;

    @JsonIgnore
    @OneToOne(mappedBy = "valoracion")
    private Clase claseValorada;

    @ManyToOne()
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioValorador;
    private String comentario;
    private int puntuacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clase getClaseValorada() {
        return claseValorada;
    }

    public void setClaseValorada(Clase claseValorada) {
        this.claseValorada = claseValorada;
    }

    public Usuario getUsuarioValorador() {
        return usuarioValorador;
    }

    public void setUsuarioValorador(Usuario usuarioValorador) {
        this.usuarioValorador = usuarioValorador;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

}
