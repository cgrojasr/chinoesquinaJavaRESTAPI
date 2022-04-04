package com.upc.chinoesquina.interfaces;

import com.upc.chinoesquina.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
