package br.com.ninja.kafka

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class Producer(private val kafkaTemplate : KafkaTemplate<String, String>) {



}