package com.desafio.controller;


import com.desafio.repository.UsuarioRepository;
import com.desafio.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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
    @PostMapping("/salvar")
    public String salvarUsuario(
            @RequestParam("nome") String nome,
            @RequestParam("idade") Integer idade,
            @RequestParam("endereco") String endereco,
            @RequestParam("biografia") String biografia
    ) throws Exception {
        usuarioService.getUsuario().setNome(nome);
        usuarioService.getUsuario().setIdade(idade);
        usuarioService.getUsuario().setEndereco(endereco);
        usuarioService.getUsuario().setBiografia(biografia);

        usuarioRepository.save(usuarioService.getUsuario());

        return "index";
    }

}
