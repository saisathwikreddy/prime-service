package edu.iu.svarikot.svarikotprimeservice.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MQConfiguration {
    @Bean
    public Queue queue() {
        return new Queue("primes");
    }
}
