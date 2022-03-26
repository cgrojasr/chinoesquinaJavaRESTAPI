package com.upc.chinoesquina.controller;

import com.upc.chinoesquina.business.ProductoLoteBL;
import com.upc.chinoesquina.model.ProductoLote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductoLoteController {
    @Autowired
    private ProductoLoteBL objProductoLoteBL = null;

    @PostMapping("/productolote")
    public ProductoLote Register(@RequestBody ProductoLote objProductoLote){
        return  objProductoLoteBL.Register(objProductoLote);
    }

    @PutMapping("/productolote")
    public ProductoLote Update(@RequestBody ProductoLote objProductoLote){
        return  objProductoLoteBL.Update(objProductoLote);
    }

    @GetMapping("/productolote")
    public Iterable<ProductoLote> GetAll(){
        return  objProductoLoteBL.GetAll();
    }

    @GetMapping("/productolote/{idProductoLote}")
    public Optional<ProductoLote> GetById(@PathVariable Integer idProductoLote){
        return  objProductoLoteBL.GetById(idProductoLote);
    }

    @DeleteMapping("/productolote/{idProductoLote}")
    public Boolean Delete(@PathVariable Integer idProductoLote){
        return  objProductoLoteBL.Delete(idProductoLote);
    }

    @GetMapping("/productolote/getByActive")
    public Iterable<ProductoLote> GetByActive(@RequestParam("eliminado") Boolean eliminado){
        return objProductoLoteBL.GetByActive(eliminado);
    }
}
