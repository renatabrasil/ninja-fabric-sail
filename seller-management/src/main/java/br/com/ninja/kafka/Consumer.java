package br.com.ninja.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "pagamento")
    public void processMessage(String content) {
        System.out.println(content);
    }
}
