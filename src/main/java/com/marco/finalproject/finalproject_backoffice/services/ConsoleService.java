package com.marco.finalproject.finalproject_backoffice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marco.finalproject.finalproject_backoffice.exceptions.MissingElementException;
import com.marco.finalproject.finalproject_backoffice.models.Console;
import com.marco.finalproject.finalproject_backoffice.repositories.ConsoleRepo;

@Service
public class ConsoleService {

    @Autowired
    private ConsoleRepo consoleRepo;

    // Explanation: Show every videogames
    public List<Console> findAll() {
        return consoleRepo.findAll();
    }

    // Explanation: Find single videogame using id
    public Optional<Console> findById(int id) {
        return consoleRepo.findById(id);
    }

    // Explanation: Check if the videogame exists
    public Console getById(int id) {
        Optional<Console> consoleAttempt = findById(id);
        if (consoleAttempt.isEmpty()) {
            throw new MissingElementException("Console non trovata");
        }

        return consoleAttempt.get();
    }
}
