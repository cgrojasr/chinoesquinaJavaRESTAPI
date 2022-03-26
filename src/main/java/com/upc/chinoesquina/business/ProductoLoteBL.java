package com.upc.chinoesquina.business;

import com.upc.chinoesquina.dataaccess.ProductoLoteDA;
import com.upc.chinoesquina.model.ProductoLote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ProductoLoteBL {

    @Autowired
    private ProductoLoteDA objProductoLoteDA = null;

    public ProductoLote Register(ProductoLote objProductoLote){
        return objProductoLoteDA.Register(objProductoLote);
    }

    public ProductoLote Update(ProductoLote objProductoLote){
        objProductoLote.setFechaModifico(new Date(System.currentTimeMillis()));
        return objProductoLoteDA.Update(objProductoLote);
    }

    public Iterable<ProductoLote> GetAll(){
        return objProductoLoteDA.GetAll();
    }

    public Optional<ProductoLote> GetById(Integer idProductoLote){
        return objProductoLoteDA.GetById(idProductoLote);
    }

    public Boolean Delete(Integer idProductoLote){
        objProductoLoteDA.Delete(idProductoLote);
        return true;
    }

    public Iterable<ProductoLote> GetByActive(Boolean eliminado){
        return objProductoLoteDA.GetByActive(eliminado);
    }
}
