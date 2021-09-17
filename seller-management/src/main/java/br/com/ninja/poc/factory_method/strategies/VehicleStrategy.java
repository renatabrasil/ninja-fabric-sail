package br.com.ninja.poc.factory_method.strategies;

public interface VehicleStrategy {
    boolean canDrive(String channel);
    void drive();
}
