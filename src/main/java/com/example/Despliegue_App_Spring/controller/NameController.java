package com.example.Despliegue_App_Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("{Name}")

    public String getname (@PathVariable String Name){
        return "hola: " + Name;
    }
}
