package com.marco.finalproject.finalproject_backoffice.models;

import java.util.Set;

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

// Explanation: roles is a JPA Entity (Map a table in the DB)
@Entity
@Table(name = "roles")
public class Role {

    // INFO: Attributes/Columns

    // Explanation: Primary KEY with autoincrement strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Explanation: role-name varchar(30)
    @NotBlank(message = "The username must not be blank, empty or null")
    @Column(name = "role_name", nullable = false, length = 30)
    private String roleName;

    // Explanation: ManyToMany join with roles entity
    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    @JsonBackReference
    private Set<User> users;

}
