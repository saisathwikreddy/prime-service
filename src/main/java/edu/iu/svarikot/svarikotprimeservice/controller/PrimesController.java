package edu.iu.svarikot.svarikotprimeservice.controller;


import edu.iu.svarikot.svarikotprimeservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;
// dummy
@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {
    IPrimesService primesService;
    public PrimesController(IPrimesService primesService){
        this.primesService = primesService;
    }
    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable("n") int n) {
        return primesService.isPrime(n);
    }
}
