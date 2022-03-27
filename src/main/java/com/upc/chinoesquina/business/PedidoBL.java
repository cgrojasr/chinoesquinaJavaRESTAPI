package com.upc.chinoesquina.business;

import com.upc.chinoesquina.dataaccess.PedidoDA;
import com.upc.chinoesquina.model.PedidoCabecera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class PedidoBL {
    @Autowired
    private PedidoDA objPedidoDA = null;

    public PedidoCabecera Register(PedidoCabecera objPedidoCabecera){
        objPedidoCabecera.setFechaRegistro(new Date(System.currentTimeMillis()));
        return objPedidoDA.Register(objPedidoCabecera);
    }

    public PedidoCabecera Update(PedidoCabecera objPedidoCabecera){
        objPedidoCabecera.setFechaModifico(new Date(System.currentTimeMillis()));
        return objPedidoDA.Update(objPedidoCabecera);
    }

    public Iterable<PedidoCabecera> GetAll(){
        return objPedidoDA.GetAll();
    }

    public Optional<PedidoCabecera> GetById(Integer idPedidoCabecera){
        return objPedidoDA.GetById(idPedidoCabecera);
    }

    public Boolean Delete(Integer idPedidoCabecera){
        return objPedidoDA.Delete(idPedidoCabecera);
    }

    public Iterable<PedidoCabecera> GetByEliminado(Boolean eliminado){
        return objPedidoDA.GetByEliminado(eliminado);
    }
}
