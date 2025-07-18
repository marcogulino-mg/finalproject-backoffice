package com.marco.finalproject.finalproject_backoffice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marco.finalproject.finalproject_backoffice.exceptions.MissingElementException;
import com.marco.finalproject.finalproject_backoffice.models.Videogame;
import com.marco.finalproject.finalproject_backoffice.repositories.VideogameRepo;

@Service
public class VideogameService {

    @Autowired
    private VideogameRepo videogameRepo;

    // Explanation: Check if a videogame exists
    public Boolean existsById(int id) {
        return videogameRepo.existsById(id);
    }

    // Explanation: Show every videogames
    public List<Videogame> findAll() {
        return videogameRepo.findAll();
    }

    // Explanation: Find single videogame using id
    public Optional<Videogame> findById(int id) {
        return videogameRepo.findById(id);
    }

    // Explanation: Check if the videogame exists and get it
    public Videogame getById(int id) {
        Optional<Videogame> vgAttempt = findById(id);
        if (vgAttempt.isEmpty()) {
            throw new MissingElementException("Videogame non trovato");
        }

        return vgAttempt.get();
    }

    // Explanation: Delete by ID
    public void deleteById(int id) {
        if (existsById(id)) {
            videogameRepo.deleteById(id);
        } else {
            throw new MissingElementException("Videogame da rimuovere non trovato");
        }

    }

    // Explanation: Search by vgName
    public List<Videogame> searchByName(String query) {
        List<Videogame> videogames = videogameRepo.findByVgNameContaining(query);
        return videogames;
    }

    // Explanation: Create a new videogame
    public Videogame create(Videogame videogame) {
        return videogameRepo.save(videogame);
    }

}
