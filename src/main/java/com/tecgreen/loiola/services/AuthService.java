package com.tecgreen.loiola.services;

import com.tecgreen.loiola.security.JWTUtil;
import com.tecgreen.loiola.security.UsuarioSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private JWTUtil jwtUtil;

    public String refreshToken() {
        UsuarioSecurity usuario = UsuarioLogadoService.usuarioLogado();

        return jwtUtil.generateToken(usuario.getUsername());
    }
}
