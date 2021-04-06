package br.com.deyvidfernandes.customer.business.object;

import br.com.deyvidfernandes.customer.controller.dto.CustomerDto;
import br.com.deyvidfernandes.customer.producer.CustomerProducer;
import br.com.deyvidfernandes.customer.producer.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomerBO {
    @Autowired
    CustomerProducer customerProducer;
    @Value("${spring.kafka.topic.customer}")
    private String topic;

    public void create(CustomerDto customerDto) {
        Customer customer = Customer.newBuilder()
                                        .setNome(customerDto.getNome())
                                        .setIdade(customerDto.getIdade())
                                        .build();
        producer(customer);
    }

    private void producer(Object customer) {
        customerProducer.producer(topic, customer);
    }
}
