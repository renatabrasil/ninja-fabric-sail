package br.com.ninja.poc.factory_method.strategies;

public class MarineVehicleStrategy implements VehicleStrategy {
    @Override
    public boolean canDrive(String channel) {
        return false;
    }

    @Override
    public void drive() {

    }
}
