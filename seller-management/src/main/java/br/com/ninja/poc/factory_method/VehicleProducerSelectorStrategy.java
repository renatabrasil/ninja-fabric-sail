package br.com.ninja.poc.factory_method;

import br.com.ninja.poc.factory_method.strategies.VehicleStrategy;

public interface VehicleProducerSelectorStrategy {
    VehicleStrategy getVehicle(String channel);

    void produce(String payload, String event);
}
