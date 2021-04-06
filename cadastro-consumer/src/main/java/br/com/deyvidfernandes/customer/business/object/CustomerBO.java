package br.com.deyvidfernandes.customer.business.object;

import br.com.deyvidfernandes.customer.consumer.dto.Customer;
import br.com.deyvidfernandes.customer.util.LogUtil;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Component;

@Component
public class CustomerBO {
    public void show(ConsumerRecord<String, Customer> record) {
        LogUtil.showLogTopic(record);
    }
}
