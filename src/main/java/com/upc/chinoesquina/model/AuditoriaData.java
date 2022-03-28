package com.upc.chinoesquina.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class AuditoriaData {
    private Integer idUsuarioRegistro;
    @JsonIgnore
    private Date fechaRegistro;
    private Integer idUsuarioModifico;
    @JsonIgnore
    private Date fechaModifico;

    public Integer getIdUsuarioRegistro() {
        return idUsuarioRegistro;
    }

    public void setIdUsuarioRegistro(Integer idUsuarioRegistro) {
        this.idUsuarioRegistro = idUsuarioRegistro;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdUsuarioModifico() {
        return idUsuarioModifico;
    }

    public void setIdUsuarioModifico(Integer idUsuarioModifico) {
        this.idUsuarioModifico = idUsuarioModifico;
    }

    public Date getFechaModifico() {
        return fechaModifico;
    }

    public void setFechaModifico(Date fechaModifico) {
        this.fechaModifico = fechaModifico;
    }
}
