package com.tecgreen.loiola.services;

import com.tecgreen.loiola.entities.Quarto;
import com.tecgreen.loiola.repositories.QuartoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartoService {

    @Autowired
    private QuartoRepository quartoRepository;

    public List<Quarto> buscarTodos() {
        return quartoRepository.findAll();
    }

    public Quarto cadastrar(Quarto quarto) {
        return quartoRepository.save(quarto);
    }
}
