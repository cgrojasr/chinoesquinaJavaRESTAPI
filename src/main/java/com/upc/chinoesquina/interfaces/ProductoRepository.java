package com.upc.chinoesquina.interfaces;

import com.upc.chinoesquina.model.Producto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {
    @Modifying
    @Transactional
    @Query("update Producto set sku = ?1, nombre = ?2, descripcion = ?3, cantidadUnitaria = ?4, idUnidadMedida = ?5, idMarca = ?6, activo = ?7, idUsuarioModifico = ?8, fechaModifico = ?9 where idProducto = ?10")
    void setByIdProducto(
            String sku,
            String nombre,
            String descripcion,
            Integer cantidadUnitaria,
            Integer idUnidadMedida,
            Integer idMarca,
            Boolean activo,
            Integer idUsuarioModifico,
            Date fechaModifico,
            Integer idProducto);

    Iterable<Producto> findByActivo(Boolean activo);
}
