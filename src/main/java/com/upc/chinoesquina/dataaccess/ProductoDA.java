package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.interfaces.ProductoRepository;
import com.upc.chinoesquina.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoDA {
    @Autowired
    private ProductoRepository repository;

    public Producto Register(Producto objProducto){
        return repository.save(objProducto);
    }

    public Producto Update(Producto objProducto){
        repository.setByIdProducto(
                objProducto.getSku(),
                objProducto.getNombre(),
                objProducto.getDescripcion(),
                objProducto.getCantidadUnitaria(),
                objProducto.getIdUnidadMedida(),
                objProducto.getIdMarca(),
                objProducto.getActivo(),
                objProducto.getIdUsuarioModifico(),
                objProducto.getFechaModifico(),
                objProducto.getIdProducto()
        );

        return objProducto;
    }

    public Iterable<Producto> GetAll(){
        return repository.findAll();
    }

    public Optional<Producto> GetById(Integer idProducto){
        return repository.findById(idProducto);
    }

    public void Delete(Integer idProducto){
        repository.deleteById(idProducto);
    }

    public Iterable<Producto> GetByActivo(Boolean activo){
        return repository.findByActivo(activo);
    }
}
