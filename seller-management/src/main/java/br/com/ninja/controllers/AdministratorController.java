package br.com.ninja.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("admin")
public class AdministratorController {

    @GetMapping("/login")
    public String login() {

        String texto = "fata pora";
        Integer aahah = 4;

        return texto;
    }
}
