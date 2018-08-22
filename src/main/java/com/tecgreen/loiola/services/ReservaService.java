package com.tecgreen.loiola.services;

import com.tecgreen.loiola.dtos.ReservaDTO;
import com.tecgreen.loiola.dtos.parsers.ReservaParser;
import com.tecgreen.loiola.entities.Reserva;
import com.tecgreen.loiola.repositories.ReservaRepository;
import com.tecgreen.loiola.security.UsuarioSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ReservaQuartoService reservaQuartoService;

    public ReservaDTO salvar(Reserva reserva) {
        UsuarioSecurity usuarioSecurity = UsuarioLogadoService.usuarioLogado();

        reserva.setUsuario(usuarioService.buscarPorCpf(usuarioSecurity.getUsername()));

        reservaRepository.save(reserva);
        reservaQuartoService.salvar(reserva, reserva.getQuartos());

        return ReservaParser.toDTO(reserva);
    }
}
