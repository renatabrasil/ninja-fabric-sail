package br.com.ninja.designpatterns.strategy;

import br.com.ninja.designpatterns.strategy.strategies.VehicleStrategy;

public interface VehicleProducerSelectorStrategy {
    VehicleStrategy getVehicle(String channel);

    void produce(String payload, String event);
}
