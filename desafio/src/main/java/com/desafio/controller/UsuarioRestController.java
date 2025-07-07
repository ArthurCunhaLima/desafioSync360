package com.desafio.controller;


import com.desafio.repository.UsuarioRepository;
import com.desafio.repository.entity.Usuario;
import com.desafio.service.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {
    @RequestMapping("usuario")
    public class UsuarioController {
        private final UsuarioRepository usuarioRepository;
        private final UsuarioService usuarioService;

        public UsuarioController(UsuarioRepository usuarioRepository, UsuarioService usuarioService){
            this.usuarioRepository = usuarioRepository;
            this.usuarioService = usuarioService;
        }
    }

}
