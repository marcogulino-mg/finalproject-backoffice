package com.marco.finalproject.finalproject_backoffice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.finalproject.finalproject_backoffice.models.Console;

public interface ConsoleRepo extends JpaRepository<Console, Integer> {
    public List<Console> findByConsoleNameContaining(String value);
}
