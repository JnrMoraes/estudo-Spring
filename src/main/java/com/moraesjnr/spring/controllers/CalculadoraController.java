package com.moraesjnr.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/soma/{a}/{b}")
    public int soma(@PathVariable(name = "a") int a,@PathVariable(name = "b")  int b){
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair (
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b){
        return a - b;
    }

}
