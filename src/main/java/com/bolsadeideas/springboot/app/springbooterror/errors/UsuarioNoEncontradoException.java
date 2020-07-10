package com.bolsadeideas.springboot.app.springbooterror.errors;

public class UsuarioNoEncontradoException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UsuarioNoEncontradoException(String id) {
        super("Usuario con ID: ".concat(id).concat(" no existe en el sistema"));
    }
    
    
}