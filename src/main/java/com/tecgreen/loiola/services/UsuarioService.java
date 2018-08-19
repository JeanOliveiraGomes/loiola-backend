package com.tecgreen.loiola.services;

import com.tecgreen.loiola.entities.Usuario;
import com.tecgreen.loiola.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorCpf(String cpf) {
        Optional<Usuario> usuario = usuarioRepository.findById(cpf);

        return usuario.orElse(null);
    }
}
