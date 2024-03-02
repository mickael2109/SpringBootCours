package com.example.SpringProjects.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class UserRessource {
    
    @GetMapping(path="/users")
    public List<Users> trouverTousUser(){
        
    }
}
