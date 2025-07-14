package com.marco.finalproject.finalproject_backoffice.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

// Explanation: Videogame is a JPA Entity (Map a table in the DB)
@Entity
@Table(name = "videogames")
public class Videogame {
    // INFO: Attributes/Columns
    // Explanation: Primary KEY with autoincrement strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Explanation: vg_name varchar(50)
    @NotBlank(message = "The videogame name must not be blank, empty or null")
    @Column(name = "vg_name", nullable = false, length = 50)
    private String vgName;

    // Explanation: publicationDate format: DD/MM/YYYY
    @NotNull(message = "The publication date must not be null")
    @Column(name = "publication_date", nullable = false)
    private LocalDate publicationDate;

    // Explanation: publisher varchar(50)
    @NotBlank(message = "The publisher name must not be blank, empty or null")
    @Column(name = "publisher", nullable = false, length = 50)
    private String publisher;

    // Explanation: developer varchar(50)
    @NotBlank(message = "The developer name must not be blank, empty or null")
    @Column(name = "developer", nullable = false, length = 50)
    private String developer;

    // Explanation: description text with 20000 max chars
    @Lob
    @Size(max = 20000, message = "The description must not be over 20000 characters")
    @Column(name = "description", nullable = true)
    private String description;

    // Explanation: cover_url varcahr(255)
    @Column(name = "cover_url", nullable = false, length = 255)
    @NotBlank(message = "cover url image must not be null, nor empty or blank")
    private String coverUrl;

    // Explanation: ManyToMany join with Console entity
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "videogame_console", joinColumns = @JoinColumn(name = "videogame_id"), inverseJoinColumns = @JoinColumn(name = "console_id"))
    private List<Console> consoles;

    // INFO: Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVgName() {
        return vgName;
    }

    public void setVgName(String vgName) {
        this.vgName = vgName;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public List<Console> getConsoles() {
        return consoles;
    }

    public void setConsoles(List<Console> consoles) {
        this.consoles = consoles;
    }

}
