package com.upc.chinoesquina.business;

import com.upc.chinoesquina.dataaccess.ProductoDA;
import com.upc.chinoesquina.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.ValidationException;
import java.util.Date;
import java.util.Optional;

@Service
public class ProductoBL {
    @Autowired
    private ProductoDA objProductoDA;

    public Producto Register(Producto objProducto){
        objProducto.setFechaRegistro(new Date(System.currentTimeMillis()));
        return objProductoDA.Register(objProducto);
    }

    public Producto Update(Producto objProducto) throws ValidationException {
        if(objProductoDA.GetById(objProducto.getIdProducto()).isPresent()){
            objProducto.setFechaModifico(new Date(System.currentTimeMillis()));
            return objProductoDA.Update(objProducto);
        } else throw new ValidationException("El producto no existe");
    }

    public Iterable<Producto> GetAll(){
        return objProductoDA.GetAll();
    }

    public Optional<Producto> GetById(Integer idProducto){
        return objProductoDA.GetById(idProducto);
    }

    public void Delete(Integer idProducto){
        objProductoDA.Delete(idProducto);
    }

    public Iterable<Producto> GetByActivo(Boolean activo){
        return objProductoDA.GetByActivo(activo);
    }
}
