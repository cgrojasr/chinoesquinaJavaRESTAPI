package com.upc.chinoesquina.interfaces;

import com.upc.chinoesquina.model.ProductoLote;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;

public interface ProductoLoteRepository extends CrudRepository<ProductoLote, Integer> {
    @Modifying
    @Transactional
    @Query("update ProductoLote pl set pl.idProducto = ?1, pl.idLocal = ?2, pl.lote = ?3, pl.fechaIngreso = ?4, pl.fechaVencimiento = ?5, pl.eliminado = ?6, pl.idUsuarioModifico = ?7, pl.fechaModifico = ?8 where pl.idProductoLote = ?9")
    void setByIdProductoLote(Integer idProducto, Integer idLocal, String lote, Date fechaIngreso, Date fechaVencimiento, Boolean eliminado, Integer idUsuarioModifico, Date fechaModifico, Integer idProductoLote);
    Iterable<ProductoLote> findByEliminado(Boolean eliminado);
}
