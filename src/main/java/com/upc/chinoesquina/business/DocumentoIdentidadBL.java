package com.upc.chinoesquina.business;

import com.upc.chinoesquina.dataaccess.DocumentoIdentidadDA;
import com.upc.chinoesquina.model.DocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class DocumentoIdentidadBL {

    @Autowired
    private DocumentoIdentidadDA objDocumentoIdentidadDA;

    public Iterable<DocumentoIdentidad> GetAll(){
        return objDocumentoIdentidadDA.GetAll();
    }

    public Optional<DocumentoIdentidad> FindById(int Id){
        return  objDocumentoIdentidadDA.FindById(Id);
    }

    public DocumentoIdentidad Create(DocumentoIdentidad objDocumentoIdentidad){
        objDocumentoIdentidad.setFechaRegistro(new Date(System.currentTimeMillis()));
        return  objDocumentoIdentidadDA.Save(objDocumentoIdentidad);
    }

    public DocumentoIdentidad Update(DocumentoIdentidad objDocumentoIdentidad){
        objDocumentoIdentidad.setFechaModifico(new Date(System.currentTimeMillis()));
        objDocumentoIdentidadDA.Update(objDocumentoIdentidad);
        return  objDocumentoIdentidad;
    }

    public Iterable<DocumentoIdentidad> GetAll(Boolean activo){
        return objDocumentoIdentidadDA.GetAll(activo);
    }
}
