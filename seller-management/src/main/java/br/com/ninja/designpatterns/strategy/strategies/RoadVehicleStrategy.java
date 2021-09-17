package br.com.ninja.designpatterns.strategy.strategies;

import br.com.ninja.kafka.domain.Road;
import br.com.ninja.designpatterns.strategy.Channel;
import org.springframework.kafka.core.KafkaTemplate;

public class RoadVehicleStrategy implements VehicleStrategy {

    private KafkaTemplate<String, Road> kafkaTemplate;

    @Override
    public boolean canDrive(String channel) {
        return channel.equalsIgnoreCase(Channel.SEA.name());
    }

    @Override
    public void drive() {
//        kafkaTemplate.send;
    }
}
