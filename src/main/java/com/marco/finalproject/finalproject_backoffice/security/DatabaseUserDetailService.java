package com.marco.finalproject.finalproject_backoffice.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.marco.finalproject.finalproject_backoffice.models.User;
import com.marco.finalproject.finalproject_backoffice.repositories.UserRepo;

@Service
public class DatabaseUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userAttempt = userRepo.findByUserName(username);

        if (userAttempt.isEmpty()) {
            throw new UsernameNotFoundException("There are no user available with username " + username);
        }

        return new DatabaseUserDetails(userAttempt.get());
    }

}
