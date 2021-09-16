package br.com.ninja.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(topics = "pagamento")
    public void processMessage(String content) {}
}
