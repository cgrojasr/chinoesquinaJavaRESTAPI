package com.upc.chinoesquina.controller;

import com.upc.chinoesquina.business.DocumentoIdentidadBL;
import com.upc.chinoesquina.model.DocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DocumentoIdentidadController {

    @Autowired
    private DocumentoIdentidadBL objDocumentoIdentidadBL;

    @GetMapping("/documentoidentidad")
    Iterable<DocumentoIdentidad> GetAll(){
        return objDocumentoIdentidadBL.GetAll();
    }

    @GetMapping("/documentoidentidad/{Id}")
    Optional<DocumentoIdentidad> GetById(@PathVariable Integer Id){
        return objDocumentoIdentidadBL.FindById(Id);
    }

    @PostMapping("/documentoidentidad")
    DocumentoIdentidad Create(@RequestBody DocumentoIdentidad objDocumentoIdentidad){
        return objDocumentoIdentidadBL.Create(objDocumentoIdentidad);
    }

    @PutMapping("/documentoidentidad")
    DocumentoIdentidad Update(@RequestBody DocumentoIdentidad objDocumentoIdentidad){
        return objDocumentoIdentidadBL.Update(objDocumentoIdentidad);
    }

    @GetMapping("/documentoidentidad/active")
    Iterable<DocumentoIdentidad> GetById(@RequestParam("activo") Boolean activo){
        return objDocumentoIdentidadBL.GetAll(activo);
    }
}
