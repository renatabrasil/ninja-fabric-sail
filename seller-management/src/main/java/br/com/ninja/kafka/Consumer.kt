package br.com.ninja.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class Consumer {
    @KafkaListener(topics = ["pagamento"])
    fun processMessage(content:String) {}
}