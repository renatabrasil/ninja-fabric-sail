package br.com.ninja.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("admin")
public class AdministratorController {

    private Logger logger = LoggerFactory.getLogger(AdministratorController.class);

    @GetMapping("/login")
    public String login() {
        logger.info("TESTE");
        logger.info("Terminei de dar oi {}", "oi");
        return "oi";

    }
}
