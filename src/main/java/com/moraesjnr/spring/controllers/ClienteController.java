package com.moraesjnr.spring.controllers;

import com.moraesjnr.spring.model.entities.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente(){
        return new Cliente(01, "Juliano","323.123.321-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id,"Maria", "123.123.123-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(
            @RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id,"José", "321.321.321-10");
    }
}
