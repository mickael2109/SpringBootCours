package com.example.SpringProjects.service;

import java.util.*;

import com.example.SpringProjects.model.User;

public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Bruno", new Date()));
        users.add(new User(2, "Micka", new Date()));
        users.add(new User(3, "Lucien", new Date()));
    }

    public List<User> afficherTout(){
        return users;
    }

    public User TrouverUser(int id){
        for(User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

}
