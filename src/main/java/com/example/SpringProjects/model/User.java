package com.example.SpringProjects.model;

import java.util.Date;

public class User {
    private int id;
    private String nom;
    private Date datanaiss;

    
    public User(int id, String nom, Date datanaiss) {
        super();
        this.id = id;
        this.nom = nom;
        this.datanaiss = datanaiss;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDatanaiss(Date datanaiss) {
        this.datanaiss = datanaiss;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public Date getDatanaiss() {
        return datanaiss;
    }

    
}
