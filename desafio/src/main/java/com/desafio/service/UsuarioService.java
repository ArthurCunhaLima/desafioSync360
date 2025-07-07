package com.desafio.service;

import com.desafio.repository.entity.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private Usuario usuario;

    public UsuarioService(){
        this.usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
