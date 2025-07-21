package com.marco.finalproject.finalproject_backoffice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.finalproject.finalproject_backoffice.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
