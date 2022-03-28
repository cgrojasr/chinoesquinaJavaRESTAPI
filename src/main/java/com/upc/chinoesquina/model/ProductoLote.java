package com.upc.chinoesquina.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ProductoLote extends AuditoriaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProductoLote;
    private Integer idProducto;
    private Integer idLocal;
    private String lote;
    private Date fechaIngreso;
    private Date fechaVencimiento;
    private Boolean eliminado;

    public Integer getIdProductoLote() {
        return idProductoLote;
    }

    public void setIdProductoLote(Integer idProductoLote) {
        this.idProductoLote = idProductoLote;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
}
