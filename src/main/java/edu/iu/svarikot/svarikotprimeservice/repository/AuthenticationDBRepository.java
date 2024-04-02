package edu.iu.svarikot.svarikotprimeservice.repository;

import edu.iu.svarikot.svarikotprimeservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationDBRepository extends CrudRepository<Customer, String> {
    Customer findByUsername(String username);
}
