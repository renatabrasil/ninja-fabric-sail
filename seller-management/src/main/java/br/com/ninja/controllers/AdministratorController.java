package br.com.ninja.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdministratorController {

    @GetMapping("/login")
    public String login() {

        return "oi";
    }
}
