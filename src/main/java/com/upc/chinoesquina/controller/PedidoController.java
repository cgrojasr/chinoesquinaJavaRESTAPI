package com.upc.chinoesquina.controller;

import com.upc.chinoesquina.business.PedidoBL;
import com.upc.chinoesquina.model.PedidoCabecera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PedidoController {
    @Autowired
    private PedidoBL objPedidoBL = null;

    @PostMapping("/pedido")
    public PedidoCabecera Register(@RequestBody PedidoCabecera objPedidoCabecera){
        return objPedidoBL.Register(objPedidoCabecera);
    }

    @PutMapping("/pedido")
    public PedidoCabecera Update(@RequestBody PedidoCabecera objPedidoCabecera){
        return objPedidoBL.Update(objPedidoCabecera);
    }

    @GetMapping("/pedido")
    public Iterable<PedidoCabecera> GetAll(){
        return objPedidoBL.GetAll();
    }

    @GetMapping("/pedido/{idPedidoCabecera}")
    public Optional<PedidoCabecera> GetById(@PathVariable Integer idPedidoCabecera){
        return objPedidoBL.GetById(idPedidoCabecera);
    }
    @DeleteMapping("/pedido/{idPedidoCabecera}")
    public Boolean Delete(@PathVariable Integer idPedidoCabecera){
        return objPedidoBL.Delete(idPedidoCabecera);
    }

    @GetMapping("/pedido/filter")
    public Iterable<PedidoCabecera> GetByEliminado(@RequestParam("eliminado") Boolean eliminado){
        return objPedidoBL.GetByEliminado(eliminado);
    }
}
