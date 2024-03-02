package com.example.SpringProjects.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.SpringProjects.service.UserDaoService;
import com.example.SpringProjects.model.User;

public class UserRessource {
    
    private UserDaoService service;


    @GetMapping(path="/users")
    public List<User> trouverTousUser(){
        return service.afficherTout();
    }

    @GetMapping(path = "/users/{id}")
    public User chercherUser(@PathVariable int id){
        return service.TrouverUser(id);
    }
}
