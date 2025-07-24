package com.marco.finalproject.finalproject_backoffice.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.finalproject.finalproject_backoffice.models.Videogame;

public interface VideogameRepo extends JpaRepository<Videogame, Integer> {
    public List<Videogame> findByVgNameContaining(String value);

    public Optional<Videogame> findBySlug(String slug);
}
