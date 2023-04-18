package com.flb.ws_etutoring.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.flb.ws_etutoring.utils.ImageUtils;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private int id;

    private String nombre;
    private String apellidos;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date fechaNacimiento;
    private String correo;
    private String ciudad;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_tipo", joinColumns = { @JoinColumn(name = "usuario_codigo") }, inverseJoinColumns = {
            @JoinColumn(name = "tipo_codigo")
    })
    private List<Tipo> tipo;

    @ManyToOne()
    @JoinColumn(name = "materia_id")
    private Materia materia;

    @JsonIgnore
    @OneToMany(mappedBy = "usuarioValorador")
    private List<Valoracion> valoraciones;

    /*@OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Usuario> clasesDadas;

    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Usuario> clasesRecibidas;*/

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
    private List<Direccion> direcciones;

    @JsonIgnore
    @OneToOne(mappedBy = "profesor", fetch = FetchType.LAZY)
    private Calendario calendario;

    @Lob
    @Column(length = 10000)
    private byte[] fotoPerfil;

    @Column(unique = true)
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(int id) {
        this.id = id;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Tipo> getTipo() {
        return tipo;
    }

    public void setTipo(List<Tipo> tipo) {
        this.tipo = tipo;
    }

    public List<Valoracion> getValoraciones() {
        return valoraciones;
    }

    public void setValoraciones(List<Valoracion> valoraciones) {
        this.valoraciones = valoraciones;
    }

    /*public List<Usuario> getClasesDadas() {
        return clasesDadas;
    }

    public void setClasesDadas(List<Usuario> clasesDadas) {
        this.clasesDadas = clasesDadas;
    }

    public List<Usuario> getClasesRecibidas() {
        return clasesRecibidas;
    }

    public void setClasesRecibidas(List<Usuario> clasesRecibidas) {
        this.clasesRecibidas = clasesRecibidas;
    }*/

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public byte[] getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(byte[] fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getImageView() {
        return ImageUtils.getImgData(this.fotoPerfil);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        Usuario other = (Usuario) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
