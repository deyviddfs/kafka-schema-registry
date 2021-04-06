package br.com.deyvidfernandes.customer.util;

import br.com.deyvidfernandes.customer.consumer.dto.Customer;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public class LogUtil {
    public static void showLogTopic(ConsumerRecord<String, Customer> record) {
        System.out.println("------------------------------------------");
        System.out.println("------------------ LOG -------------------");
        System.out.println("------------------------------------------");
        System.out.println("topic: " + record.topic());
        System.out.println("partition: " + record.partition());
        System.out.println("offset: " + record.offset());
        System.out.println("key: " + record.key());
        System.out.println("value: " + record.value());
    }
}
