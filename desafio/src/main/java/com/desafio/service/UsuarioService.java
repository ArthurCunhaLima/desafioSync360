package com.desafio.service;

import com.desafio.repository.UsuarioRepository;
import com.desafio.repository.entity.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UsuarioService {
    private Usuario usuario;
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuario = new Usuario();
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario getUsuario() {
        return usuarioRepository.findById(1L)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }



}
