package com.desafio.controller;


import com.desafio.repository.UsuarioRepository;
import com.desafio.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class UsuarioRestController {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioService usuarioService;

    public UsuarioRestController(UsuarioRepository usuarioRepository,UsuarioService usuarioService){
        this.usuarioRepository = usuarioRepository;
        this.usuarioService = usuarioService;
    }


    @PutMapping("alterarIdade")
    public void alterarIdade(@PathVariable int idade){
        usuarioService.getUsuario().setIdade(idade);
    }

}
