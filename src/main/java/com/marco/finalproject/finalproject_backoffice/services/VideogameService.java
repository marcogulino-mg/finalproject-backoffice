package com.marco.finalproject.finalproject_backoffice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    // Explanation: Check if the videogame exists
    public Videogame getById(int id) {
        Optional<Videogame> vgAttempt = findById(id);
        if (vgAttempt.isEmpty()) {
            // throw new RuntimeException("Missing Videogame");
        }

        return vgAttempt.get();
    }

    // Explanation: Delete by ID
    public Boolean deleteById(int id) {
        if (existsById(id)) {
            videogameRepo.deleteById(id);
            return true;
        }

        return false;
    }

}
