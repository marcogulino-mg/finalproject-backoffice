package com.marco.finalproject.finalproject_backoffice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.finalproject.finalproject_backoffice.models.Videogame;

public interface VideogameRepo extends JpaRepository<Videogame, Integer> {

}
