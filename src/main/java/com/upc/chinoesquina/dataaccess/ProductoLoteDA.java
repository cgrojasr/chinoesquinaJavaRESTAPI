package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.interfaces.ProductoLoteRepository;
import com.upc.chinoesquina.model.ProductoLote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoLoteDA {
    @Autowired
    private ProductoLoteRepository repository = null;

    public ProductoLote Register(ProductoLote objProductoLote){
        return repository.save(objProductoLote);
    }

    public ProductoLote Update(ProductoLote objProductoLote){
        repository.setByIdProductoLote(
                objProductoLote.getIdProducto(),
                objProductoLote.getIdLocal(),
                objProductoLote.getLote(),
                objProductoLote.getFechaIngreso(),
                objProductoLote.getFechaVencimiento(),
                objProductoLote.getEliminado(),
                objProductoLote.getIdUsuarioModifico(),
                objProductoLote.getFechaModifico(),
                objProductoLote.getIdProductoLote()
        );

        return objProductoLote;
    }

    public Iterable<ProductoLote> GetAll(){
        return repository.findAll();
    }

    public Optional<ProductoLote> GetById(Integer idProductoLote){
        return repository.findById(idProductoLote);
    }

    public void Delete(Integer idProductoLote){
        repository.deleteById(idProductoLote);
    }

    public Iterable<ProductoLote> GetByActive(Boolean eliminado){
        return repository.findByEliminado(eliminado);
    }
}
