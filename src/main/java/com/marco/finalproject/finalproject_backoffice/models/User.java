package com.marco.finalproject.finalproject_backoffice.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// Explanation: User is a JPA Entity (Map a table in the DB)
@Entity
@Table(name = "users")
public class User {
    // INFO: Attributes/Columns

    // Explanation: Primary KEY with autoincrement strategy
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Explanation: user-name varchar(30)
    @NotBlank(message = "The username must not be blank, empty or null")
    @Column(name = "user_name", nullable = false, length = 30)
    private String userName;

    // Explanation: password varchar(30)
    @Size(min = 8, message = "The password must have atleast 8 or more characters")
    @NotBlank(message = "The password must not be blank, empty or null")
    @Column(name = "password", nullable = false, length = 30)
    private String password;

    // Explanation: ManyToMany join with roles entity
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_user", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    // INFO: Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}
