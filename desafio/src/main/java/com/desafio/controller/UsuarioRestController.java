package com.desafio.controller;


import com.desafio.repository.UsuarioRepository;
import com.desafio.repository.entity.Usuario;
import com.desafio.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("usuario")
public class UsuarioRestController {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioService usuarioService;

    public UsuarioRestController(UsuarioRepository usuarioRepository, UsuarioService usuarioService) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioService = usuarioService;
    }

    @GetMapping("retornarNome")
        public String retornarNome(){
        return usuarioService.getUsuario().getNome();
    }

    @GetMapping("retornarIdade")
    public int retornarIdade(){
        return usuarioService.getUsuario().getIdade();
    }
    @GetMapping("retornarEndereco")
    public String retornarEndereco(){
        return usuarioService.getUsuario().getEndereco();
    }
    @GetMapping("retornarBiografia")
    public String retornarBio(){
        return usuarioService.getUsuario().getBiografia();
    }
}

