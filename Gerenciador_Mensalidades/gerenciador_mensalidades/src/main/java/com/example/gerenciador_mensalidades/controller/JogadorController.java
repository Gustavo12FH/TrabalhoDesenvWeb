package com.example.gerenciador_mensalidades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gerenciador_mensalidades.model.Jogador;
import com.example.gerenciador_mensalidades.repository.JogadorRepository;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    @GetMapping
    public List<Jogador> getAllJogadores() {
        return jogadorRepository.findAll();
    }

    @PostMapping
    public Jogador createJogador(@RequestBody Jogador jogador) {
        return jogadorRepository.save(jogador);
    }
}