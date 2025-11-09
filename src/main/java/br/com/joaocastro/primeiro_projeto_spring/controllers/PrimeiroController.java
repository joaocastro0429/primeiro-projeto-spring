package br.com.joaocastro.primeiro_projeto_spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/primeirocontroller")
public class PrimeiroController {
    @GetMapping("/primeiro")
    public String primeiroMetodo() {
        return "Olá Mundo! Meu primeiro projeto Spring Boot.";
    }

    @PostMapping("/create")

    public String Create(@RequestBody String dados){
        return "Dados recebidos com sucesso: " + dados;
    }
    
}
