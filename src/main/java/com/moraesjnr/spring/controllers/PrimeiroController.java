package com.moraesjnr.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @GetMapping(path = {"/ola", "/saudacoes"})
    public String ola(){
        return "Olá!";
    }
}
