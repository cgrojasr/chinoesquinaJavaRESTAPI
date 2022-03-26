package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.interfaces.DocumentoIdentidadRepository;
import com.upc.chinoesquina.model.DocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentoIdentidadDA {
    @Autowired
    private DocumentoIdentidadRepository repository = null;

    public Iterable<DocumentoIdentidad> GetAll(){
        return repository.findAll();
    }

    public Optional<DocumentoIdentidad> FindById(int Id){
        return  repository.findById(Id);
    }

    public DocumentoIdentidad Save(DocumentoIdentidad objDocumentoIdentidad){
        return  repository.save(objDocumentoIdentidad);
    }

    public Iterable<DocumentoIdentidad> GetAll(boolean activo){
        return repository.findByActivo(activo);
    }

    public void Update(DocumentoIdentidad objDocumentoIdentidad){
        repository.setByIdDocumentoIdentidad(
                objDocumentoIdentidad.getNombre(),
                objDocumentoIdentidad.getAbreviatura(),
                objDocumentoIdentidad.getActivo(),
                objDocumentoIdentidad.getEliminado(),
                objDocumentoIdentidad.getIdUsuarioModifico(),
                objDocumentoIdentidad.getFechaModifico(),
                objDocumentoIdentidad.getIdDocumentoIdentidad()
        );
    }
}
