package br.com.deyvidfernandes.customer.consumer;

import br.com.deyvidfernandes.customer.business.object.CustomerBO;
import br.com.deyvidfernandes.customer.consumer.dto.Customer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerConsumer {
    @Autowired
    CustomerBO customerBO;

    @KafkaListener(topics = "${spring.kafka.topic.customer}", groupId = "${spring.kafka.consumer.group-id}")
    private void process(ConsumerRecord<String, Customer> record){
        customerBO.show(record);
    }
}
