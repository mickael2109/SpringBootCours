package com.example.SpringProjects.resource;

import org.springframework.web.bind.annotation.RestController;

import com.example.SpringProjects.model.HelloBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class Hello {
    
    @GetMapping(path="/hello")
    public String getHello() {
        return "<h1>Hello !!! </h1>";
    }

    @GetMapping(path="/hellobean")
    public HelloBean getHelloBean() {
        return new HelloBean("<h1>Hello !!! </h1>");
    }
    
    @GetMapping(path="/hellobean/param/{nom}")
    public HelloBean getHelloBeanParam(@PathVariable String nom){
        return new HelloBean(String.format("Bonjour, %s", nom));
    }
    
}
