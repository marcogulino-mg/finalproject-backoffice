package com.marco.finalproject.finalproject_backoffice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marco.finalproject.finalproject_backoffice.models.Videogame;
import com.marco.finalproject.finalproject_backoffice.repositories.VideogameRepo;

@Service
public class VideogameService {

    @Autowired
    private VideogameRepo videogameRepo;

    // Show every videogames
    public List<Videogame> findAll() {
        return videogameRepo.findAll();
    }
}
