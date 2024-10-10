package com.example.gerenciador_mensalidades.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gerenciador_mensalidades.model.Pagamento;
import com.example.gerenciador_mensalidades.repository.PagamentoRepository;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    // Endpoint para listar todos os pagamentos
    @GetMapping
    public List<Pagamento> getAllPagamentos() {
        return pagamentoRepository.findAll();
    }

    // Endpoint para criar um novo pagamento (opcional)
    @PostMapping
    public Pagamento createPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    // Endpoint para listar os pagamentos de um jogador específico
    /**
     * @param jogadorId
     * @return
     */
    @GetMapping("/jogador/{jogadorId}")
    public List<Pagamento> getPagamentosByJogador(@PathVariable Integer jogadorId) {
        return pagamentoRepository.findByJogadorCodJogador(jogadorId);
    }
}
