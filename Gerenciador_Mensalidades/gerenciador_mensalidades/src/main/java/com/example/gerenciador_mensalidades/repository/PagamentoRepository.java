package com.example.gerenciador_mensalidades.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gerenciador_mensalidades.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

    // Método para buscar todos os pagamentos de um jogador específico
    List<Pagamento> findByJogadorCodJogador(Integer jogadorId);
}