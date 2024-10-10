package com.example.gerenciador_mensalidades.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codJogador;
    
    private String nome;
    private String email;
    private LocalDate datanasc;

    public Jogador() {}

    public Jogador(String nome, String email, LocalDate datanasc) {
        this.nome = nome;
        this.email = email;
        this.datanasc = datanasc;
    }

    // Getters e Setters
    public Integer getCodJogador() {
        return codJogador;
    }

    public void setCodJogador(Integer codJogador) {
        this.codJogador = codJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(LocalDate datanasc) {
        this.datanasc = datanasc;
    }
}
