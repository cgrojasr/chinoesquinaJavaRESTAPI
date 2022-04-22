package com.upc.chinoesquina.controller;

import com.upc.chinoesquina.business.ProductoBL;
import com.upc.chinoesquina.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
    @CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "http://chinoesquina2.s3-website.us-east-2.amazonaws.com")
public class ProductoController {
    @Autowired
    private ProductoBL objProductoBL = null;

    @GetMapping
    public Iterable<Producto> GetAll(){
        return objProductoBL.GetAll();
    }

    @GetMapping("/{idProducto}")
    public Optional<Producto> GetById(@PathVariable Integer idProducto){
        return objProductoBL.GetById(idProducto);
    }

    @PostMapping
    public Producto Register(@RequestBody Producto objProducto){
        return objProductoBL.Register(objProducto);
    }

    @PutMapping
    public ResponseEntity<Producto> Update(@RequestBody Producto objProducto) throws Exception{
        return new ResponseEntity(objProductoBL.Update(objProducto), HttpStatus.OK);
    }

    @DeleteMapping("/{idProducto}")
    public Boolean Delete(@PathVariable Integer idProducto){
        objProductoBL.Delete(idProducto);
        return true;
    }

    @GetMapping("/filterByActivo")
    public Iterable<Producto> GetByActivo(@PathParam("activo") Boolean activo){
        return objProductoBL.GetByActivo(activo);
    }

    @GetMapping("/pagination/{offset}/{pageSize}")
    public Page<Producto> GetAllPagination(@PathVariable int offset, @PathVariable int pageSize){
        return objProductoBL.GetAllPagination(offset, pageSize);
    }
}
