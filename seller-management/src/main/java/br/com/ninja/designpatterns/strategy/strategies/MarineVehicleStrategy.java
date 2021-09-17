package br.com.ninja.designpatterns.strategy.strategies;

public class MarineVehicleStrategy implements VehicleStrategy {
    @Override
    public boolean canDrive(String channel) {
        return false;
    }

    @Override
    public void drive() {

    }
}
