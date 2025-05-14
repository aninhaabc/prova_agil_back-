package com.insper.prova.controller;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "musicas")
public class Musica {

    @Id
    private String id;

    private String titulo;
    private String descricao;
    private String prioridade;
    private String emailCriador;

    public Musica() {}

    public Musica(String titulo, String descricao, String prioridade, String emailCriador) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.emailCriador = emailCriador;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getEmailCriador() {
        return emailCriador;
    }

    public void setEmailCriador(String emailCriador) {
        this.emailCriador = emailCriador;
    }
}
