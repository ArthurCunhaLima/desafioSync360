package com.desafio.controller;


import com.desafio.repository.UsuarioRepository;
import com.desafio.repository.entity.Usuario;
import com.desafio.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioRepository usuarioRepository, UsuarioService usuarioService){
        this.usuarioRepository = usuarioRepository;
        this.usuarioService = usuarioService;
    }

    @GetMapping()
    public String paginaInicial(){
        return "index";
    }
    @GetMapping("alterar")
    public String paginaAlterar(){
        return "alterar/index";
    }


}
