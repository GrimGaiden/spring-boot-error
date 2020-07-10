package com.bolsadeideas.springboot.app.springbooterror.controller;

import com.bolsadeideas.springboot.app.springbooterror.errors.UsuarioNoEncontradoException;
import com.bolsadeideas.springboot.app.springbooterror.models.domain.Usuario;
import com.bolsadeideas.springboot.app.springbooterror.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/index")
    public String index() {
        //int num = 8/0;
        Integer valor = Integer.parseInt("a");
        return "index";
    }

    @GetMapping("/ver/{id}")
    public String ver(@PathVariable Integer id, Model model) {
        Usuario usuario = usuarioService.obtenerPorId(id);

        if(usuario == null) {
            throw new UsuarioNoEncontradoException(id.toString());
        }
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Detalle usuario ".concat(usuario.getNombre()));
        return "ver";
    }
}