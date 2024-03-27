package edu.iu.svarikot.svarikotprimeservice.repository;

import edu.iu.svarikot.svarikotprimeservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationRepository {
    boolean save(Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;
}
