package com.tecgreen.loiola.controllers;

import com.tecgreen.loiola.entities.Quarto;
import com.tecgreen.loiola.services.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "quartos")
public class QuartoController {

    @Autowired
    private QuartoService quartoService;

    @GetMapping
    public ResponseEntity<List<Quarto>> buscarTodos() {
        List<Quarto> quartos = quartoService.buscarTodos();

        return ResponseEntity.ok(quartos);
    }

    @PostMapping
    public ResponseEntity<Quarto> cadastrar(@RequestBody Quarto quarto) {
        Quarto novoQuarto = quartoService.cadastrar(quarto);

        return ResponseEntity.ok(novoQuarto);
    }
}