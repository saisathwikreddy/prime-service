package edu.iu.svarikot.svarikotprimeservice.service;

import edu.iu.svarikot.svarikotprimeservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
//    boolean login(String username, String password) throws  IOException;
}
