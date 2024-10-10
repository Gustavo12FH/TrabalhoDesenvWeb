package com.example.gerenciador_mensalidades.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.gerenciador_mensalidades.model.Jogador;
import com.example.gerenciador_mensalidades.model.Pagamento;
import com.example.gerenciador_mensalidades.repository.JogadorRepository;
import com.example.gerenciador_mensalidades.repository.PagamentoRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Override
    public void run(String... args) throws Exception {
        Jogador jogador1 = new Jogador("Gustavo R. Gomes", "gustavo@hotmail.com", LocalDate.of(2002, 8, 16));
        Jogador jogador2 = new Jogador("João Pedro Neves", "JoaoPNeves@gmail.com", LocalDate.of(2003, 2, 27));
        Jogador jogador3 = new Jogador("Yuri Alberto", "Maior9dahistoria@gmail.com", LocalDate.of(1995, 4, 23));


        jogadorRepository.saveAll(List.of(jogador1, jogador2, jogador3));

        criarPagamentos(jogador1);
        criarPagamentos(jogador2);
        criarPagamentos(jogador3);

    }

    private void criarPagamentos(Jogador jogador) {
        Pagamento pagamento1 = new Pagamento((short) 2024, (byte) 1, 220.00, jogador);
        Pagamento pagamento2 = new Pagamento((short) 2024, (byte) 2, 175.00, jogador);
        Pagamento pagamento3 = new Pagamento((short) 2024, (byte) 3, 99.00, jogador);

        pagamentoRepository.saveAll(List.of(pagamento1, pagamento2, pagamento3));
    }
}