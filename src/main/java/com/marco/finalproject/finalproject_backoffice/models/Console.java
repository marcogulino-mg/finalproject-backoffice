package com.marco.finalproject.finalproject_backoffice.models;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

    // Explanation: description text with 20000 max chars
    @Lob
    @Size(max = 20000, message = "The description must not be over 20000 characters")
    @Column(name = "description", nullable = true)
    private String description;

    // Explanation: publicationDate format: DD/MM/YYYY
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "The publication date must not be null")
    private LocalDate releaseDate;

    // Explanation: cover_url varcahr(255)
    @Column(name = "cover_url", nullable = false, length = 255)
    @NotBlank(message = "The cover url image must not be null, nor empty or blank")
    private String coverUrl;

    // Explanation: cover_url varcahr(255)
    @Column(name = "small_icon_url", nullable = false, length = 255)
    @NotBlank(message = "The icon url image must not be null, nor empty or blank")
    private String smallIconUrl;

    // Explanation: slug identifier
    @Column(name = "slug", nullable = false, unique = true, length = 100)
    private String slug;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getSmallIconUrl() {
        return smallIconUrl;
    }

    public void setSmallIconUrl(String smallIconUrl) {
        this.smallIconUrl = smallIconUrl;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public List<Videogame> getVideogames() {
        return videogames;
    }

    public void setVideogames(List<Videogame> videogames) {
        this.videogames = videogames;
    }

    // Other Methods
    // Explanation: Generate Slug
    @PrePersist
    @PreUpdate
    private void generateSlug() {
        if (this.slug == null || this.slug.isBlank()) {
            if (this.consoleName != null && !this.consoleName.isBlank()) {
                this.slug = consoleName.toLowerCase()
                        .replaceAll("[^a-z0-9]+", "-")
                        .replaceAll("^-|-$", "");
            }
        }
    }

}
