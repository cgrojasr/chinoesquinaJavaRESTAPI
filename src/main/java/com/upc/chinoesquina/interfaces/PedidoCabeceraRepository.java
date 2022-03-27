package com.upc.chinoesquina.interfaces;

import com.upc.chinoesquina.model.PedidoCabecera;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;

public interface PedidoCabeceraRepository extends CrudRepository<PedidoCabecera, Integer> {
    @Modifying
    @Transactional
    @Query("update PedidoCabecera pc set pc.idUsuario = ?1, pc.fecha = ?2, pc.idLocal = ?3, pc.cantidadItems = ?4, pc.montoTotal = ?5, pc.eliminado = ?6, pc.idUsuarioModifico = ?7, pc.fechaModifico = ?8 where pc.idPedidoCabecera = ?9")
    void setByIdPedidoCabecera(Integer idUsuario,
                               Date fecha,
                               Integer idLocal,
                               Integer cantidadItems,
                               Float montoTotal,
                               Boolean eliminado,
                               Integer idUsuarioModifico,
                               Date fechaModifico,
                               Integer idPedidoCabecera);
    Iterable<PedidoCabecera> findByEliminado(Boolean eliminado);
}
