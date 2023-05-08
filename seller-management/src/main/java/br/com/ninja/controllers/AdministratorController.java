package br.com.ninja.controllers;

import br.com.ninja.domain.requests.UserRequest;
import br.com.ninja.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("admin")
public class AdministratorController {

    private Logger logger = LoggerFactory.getLogger(AdministratorController.class);
    private UserService userService;

    @Autowired
    public AdministratorController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ResponseEntity<String> login() {
        logger.info("TESTE");
        logger.info("Terminei de dar oi {}", "oi");
        return ResponseEntity.ok("oi");
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody @Validated UserRequest userRequest) {
        logger.info("Cadastrando o usuario={}", userRequest.toString());

//        userService.createUser(userRequest);

        return ResponseEntity.created(null).build();
    }
}
