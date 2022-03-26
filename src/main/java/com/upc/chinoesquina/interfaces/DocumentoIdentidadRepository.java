package com.upc.chinoesquina.interfaces;

import com.upc.chinoesquina.model.DocumentoIdentidad;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;

public interface DocumentoIdentidadRepository extends CrudRepository<DocumentoIdentidad, Integer> {
    Iterable<DocumentoIdentidad> findByActivo(Boolean activo);
    //Iterable<DocumentoIdentidad> findByActivo(Boolean activo, Integer idLocal);
    @Modifying
    @Transactional
    @Query("update DocumentoIdentidad di set di.nombre = ?1, di.abreviatura = ?2, di.activo = ?3, di.eliminado = ?4, di.idUsuarioModifico = ?5, di.fechaModifico = ?6 where di.idDocumentoIdentidad = ?7")
    void setByIdDocumentoIdentidad(String nombre, String abreviatura, Boolean activo, Boolean eliminado, Integer idUsuarioModifico, Date fechaModifico, Integer idDocumentoIdentidad);
}
