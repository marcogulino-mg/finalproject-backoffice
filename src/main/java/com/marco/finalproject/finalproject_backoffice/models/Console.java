package com.marco.finalproject.finalproject_backoffice.models;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// Explanation: Videogame is a JPA Entity (Map a table in the DB)
@Entity
@Table(name = "consoles")
public class Console {
    // INFO: Attributes/Columns
    // Explanation: Primary KEY with autoincrement strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Explanation: console_name varchar(50)
    @NotBlank(message = "The videogame name must not be blank, empty or null")
    @Column(name = "console_name", nullable = false, length = 50)
    private String consoleName;

    // Explanation: publisher varchar(50)
    @NotBlank(message = "The videogame name must not be blank, empty or null")
    @Column(name = "publisher", nullable = false, length = 50)
    private String publisher;

    // Explanation: publicationDate format: DD/MM/YYYY
    @NotNull(message = "The publication date must not be null")
    private LocalDate publicationDate;

    @ManyToMany(mappedBy = "consoles", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Videogame> videogames;

    // INFO: Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConsoleName() {
        return consoleName;
    }

    public void setConsoleName(String consoleName) {
        this.consoleName = consoleName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<Videogame> getVideogames() {
        return videogames;
    }

    public void setVideogames(List<Videogame> videogames) {
        this.videogames = videogames;
    }

}
