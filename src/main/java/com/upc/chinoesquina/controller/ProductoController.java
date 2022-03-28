package com.upc.chinoesquina.controller;

import com.upc.chinoesquina.business.ProductoBL;
import com.upc.chinoesquina.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
public class ProductoController {
    @Autowired
    private ProductoBL objProductoBL;

    @GetMapping("/producto")
    public Iterable<Producto> GetAll(){
        return objProductoBL.GetAll();
    }

    @GetMapping("/producto/{idProducto}")
    public Optional<Producto> GetById(@PathVariable Integer idProducto){
        return objProductoBL.GetById(idProducto);
    }

    @PostMapping("/producto")
    public Producto Register(@RequestBody Producto objProducto){
        return objProductoBL.Register(objProducto);
    }

    @PutMapping("/producto")
    public Producto Update(@RequestBody Producto objProducto){
        return objProductoBL.Update(objProducto);
    }

    @DeleteMapping("/producto/{idProducto}")
    public Boolean Delete(@PathVariable Integer idProducto){
        objProductoBL.Delete(idProducto);
        return true;
    }

    @GetMapping("/producto/filterByActivo")
    public Iterable<Producto> GetByActivo(@PathParam("activo") Boolean activo){
        return objProductoBL.GetByActivo(activo);
    }
}
