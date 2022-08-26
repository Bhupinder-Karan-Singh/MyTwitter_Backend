package com.example.mytwitter_backend.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username.equals("bhupinderkaransingh@gmail.com")){
            return new User("bhupinderkaransingh@gmail.com","bhupi12345678", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("No user found");
        }
    }
}
