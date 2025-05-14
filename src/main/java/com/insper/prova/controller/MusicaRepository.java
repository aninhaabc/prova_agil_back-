package com.insper.prova.controller;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicaRepository extends MongoRepository<Musica, String> {
    List<Musica> findByEmailCriador(String emailCriador);
}