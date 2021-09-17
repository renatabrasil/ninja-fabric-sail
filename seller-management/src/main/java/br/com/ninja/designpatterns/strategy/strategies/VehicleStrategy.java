package br.com.ninja.designpatterns.strategy.strategies;

public interface VehicleStrategy {
    boolean canDrive(String channel);
    void drive();
}
