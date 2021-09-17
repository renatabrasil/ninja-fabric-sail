package br.com.ninja.designpatterns.strategy;

import br.com.ninja.designpatterns.strategy.strategies.VehicleStrategy;

public interface VehicleSelectorStrategy {
    VehicleStrategy getVehicle(String channel);

    void execute(String payload, String event);
}
