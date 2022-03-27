package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.interfaces.PedidoCabeceraRepository;
import com.upc.chinoesquina.model.PedidoCabecera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoDA {
    @Autowired
    private PedidoCabeceraRepository repository = null;

    public PedidoCabecera Register(PedidoCabecera objPedidoCabecera){
        return repository.save(objPedidoCabecera);
    }

    public PedidoCabecera Update(PedidoCabecera objPedidoCabecera){
        repository.setByIdPedidoCabecera(objPedidoCabecera.getIdUsuario(),
                objPedidoCabecera.getFecha(),
                objPedidoCabecera.getIdLocal(),
                objPedidoCabecera.getCantidadItems(),
                objPedidoCabecera.getMontoTotal(),
                objPedidoCabecera.getEliminado(),
                objPedidoCabecera.getIdUsuarioModifico(),
                objPedidoCabecera.getFechaModifico(),
                objPedidoCabecera.getIdPedidoCabecera());

        return objPedidoCabecera;
    }

    public Iterable<PedidoCabecera> GetAll(){
        return repository.findAll();
    }

    public Optional<PedidoCabecera> GetById(Integer idPedidoCabecera){
        return repository.findById(idPedidoCabecera);
    }

    public Boolean Delete(Integer idPedidoCabecera){
        repository.deleteById(idPedidoCabecera);
        return true;
    }

    public Iterable<PedidoCabecera> GetByEliminado(Boolean eliminado){
        return repository.findByEliminado(eliminado);
    }
}
