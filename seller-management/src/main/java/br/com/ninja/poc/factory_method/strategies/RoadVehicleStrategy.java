package br.com.ninja.poc.factory_method.strategies;

import br.com.ninja.domain.CriarEAtualizarConta;
import br.com.ninja.poc.factory_method.Channel;
import org.springframework.kafka.core.KafkaTemplate;

public class RoadVehicleStrategy implements VehicleStrategy {

    private KafkaTemplate<String, CriarEAtualizarConta> kafkaTemplate;

    @Override
    public boolean canDrive(String channel) {
        return channel.equalsIgnoreCase(Channel.SEA.name());
    }

    @Override
    public void drive() {
//        kafkaTemplate.send;
    }
}
