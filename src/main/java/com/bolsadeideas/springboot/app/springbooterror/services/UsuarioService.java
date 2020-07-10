package com.bolsadeideas.springboot.app.springbooterror.services;

import java.util.List;

import com.bolsadeideas.springboot.app.springbooterror.models.domain.Usuario;

public interface UsuarioService {
    
    List<Usuario> listar();
    Usuario obtenerPorId(Integer id);
}