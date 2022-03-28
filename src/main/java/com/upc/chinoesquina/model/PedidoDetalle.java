package com.upc.chinoesquina.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PedidoDetalle extends AuditoriaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedidoDetalle;
    private Integer idPedidoCabecera;
    private Integer idProductoLote;
    private Float precio;
    private Boolean eliminado;

    public Integer getIdPedidoDetalle() {
        return idPedidoDetalle;
    }

    public void setIdPedidoDetalle(Integer idPedidoDetalle) {
        this.idPedidoDetalle = idPedidoDetalle;
    }

    public Integer getIdPedidoCabecera() {
        return idPedidoCabecera;
    }

    public void setIdPedidoCabecera(Integer idPedidoCabecera) {
        this.idPedidoCabecera = idPedidoCabecera;
    }

    public Integer getIdProductoLote() {
        return idProductoLote;
    }

    public void setIdProductoLote(Integer idProductoLote) {
        this.idProductoLote = idProductoLote;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
}
