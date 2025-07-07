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
    @PutMapping("alterarNome")
    public void alterarNome(@PathVariable String nome){
        usuarioService.getUsuario().setNome(nome);
    }
    @PutMapping("alterarEndereco")
    public void alterarEndereco(@PathVariable String endereco){
        usuarioService.getUsuario().setEndereco(endereco);
    }
    @PutMapping("alterarBio")
    public void alterarBio(@PathVariable String biografia){
        usuarioService.getUsuario().setBiografia(biografia);
    }
}
