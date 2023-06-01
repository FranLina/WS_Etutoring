package com.flb.ws_etutoring.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Provincias {
    @Id
    private int idProvincia;

    @ManyToOne()
    @JoinColumn(name = "idCCAA")
    private Ccaa ccaa;
    private String provincia;

    public Provincias() {
    }

    public Provincias(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Provincias(int idProvincia, Ccaa ccaa, String provincia) {
        this.idProvincia = idProvincia;
        this.ccaa = ccaa;
        this.provincia = provincia;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Ccaa getCcaa() {
        return ccaa;
    }

    public void setCcaa(Ccaa ccaaa) {
        this.ccaa = ccaaa;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}
