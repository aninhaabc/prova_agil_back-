package com.insper.prova.controller;

import com.insper.prova.controller.Musica;
import com.insper.prova.controller.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;

    public Musica save(Musica musica) {
        return musicaRepository.save(musica);
    }

    public List<Musica> list(String email, List<String> roles) {
        if (roles.contains("ADMIN")) {
            return musicaRepository.findAll();
        } else {
            return musicaRepository.findByEmailCriador(email);
        }
    }

    public void delete(String id) {
        Musica musica = musicaRepository.findById(id).orElseThrow();
        musicaRepository.delete(musica);
    }
}