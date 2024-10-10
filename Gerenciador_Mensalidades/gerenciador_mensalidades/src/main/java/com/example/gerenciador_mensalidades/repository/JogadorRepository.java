package com.example.gerenciador_mensalidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gerenciador_mensalidades.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
}