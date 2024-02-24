package edu.iu.svarikot.svarikotprimeservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
    @GetMapping
    public String greeting() {
        return "Welcome to primes service!";
    }
}
