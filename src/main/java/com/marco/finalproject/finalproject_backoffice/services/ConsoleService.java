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

    // Explanation: Check if a console exists
    public Boolean existsById(int id) {
        return consoleRepo.existsById(id);
    }

    // Explanation: Show every consoles
    public List<Console> findAll() {
        return consoleRepo.findAll();
    }

    // Explanation: Find single console using id
    public Optional<Console> findById(int id) {
        return consoleRepo.findById(id);
    }

    // Explanation: Check if the console exists and get it
    public Console getById(int id) {
        Optional<Console> consoleAttempt = findById(id);
        if (consoleAttempt.isEmpty()) {
            throw new MissingElementException("Console non trovata");
        }

        return consoleAttempt.get();
    }

    // Explanation: Delete by ID
    public void deleteById(int id) {
        if (existsById(id)) {
            consoleRepo.deleteById(id);
        } else {
            throw new MissingElementException("Console da rimuovere non trovata");
        }
    }

    // Explanation: Create a new console
    public Console create(Console console) {
        return consoleRepo.save(console);
    }
}
