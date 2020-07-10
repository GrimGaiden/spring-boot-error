package com.bolsadeideas.springboot.app.springbooterror.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.app.springbooterror.models.domain.Usuario;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("usuario")
public class UsuarioServiceIml implements UsuarioService {

    private List<Usuario> lista;

    public UsuarioServiceIml() {
        this.lista = new ArrayList<>();
        this.lista.add(new Usuario(1, "Andrés", "Guzmán"));
        this.lista.add(new Usuario(2, "Pepa", "García"));
        this.lista.add(new Usuario(3, "Lalo", "Mena"));
        this.lista.add(new Usuario(4, "Luci", "Fernández"));
        this.lista.add(new Usuario(5, "Pato", "González"));
        this.lista.add(new Usuario(6, "Paco", "Rodríguez"));
        this.lista.add(new Usuario(7, "Juan", "Gómez"));
    }

    @Override
    public List<Usuario> listar() {
        return lista;
    }

    @Override
    public Usuario obtenerPorId(Integer id) {
        for (Usuario user : lista) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public Optional<Usuario> obtenerPorIdOptional(Integer id) {
        Usuario usuario = obtenerPorId(id);
        return Optional.ofNullable(usuario);
    }
}