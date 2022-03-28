package com.upc.chinoesquina.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DocumentoIdentidad extends AuditoriaData {
    //Alt+Insert para generar los getters y setters en Windows
    //Command + N para Linux o MacOs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDocumentoIdentidad;
    private String nombre;
    private String abreviatura;
    private Boolean activo;
    private Boolean eliminado;

    public Integer getIdDocumentoIdentidad() {
        return idDocumentoIdentidad;
    }

    public void setIdDocumentoIdentidad(Integer idDocumentoIdentidad) {
        this.idDocumentoIdentidad = idDocumentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
}
