package com.example.gerenciador_mensalidades.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codPagamento;
    
    private short ano;
    private byte mes;
    private double valor;

    @ManyToOne
    @JoinColumn(name = "cod_jogador")
    private Jogador jogador;

    public Pagamento() {}

    public Pagamento(short ano, byte mes, double valor, Jogador jogador) {
        this.ano = ano;
        this.mes = mes;
        this.valor = valor;
        this.jogador = jogador;
    }

    // Getters e Setters
    public Integer getCodPagamento() {
        return codPagamento;
    }

    public void setCodPagamento(Integer codPagamento) {
        this.codPagamento = codPagamento;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
}