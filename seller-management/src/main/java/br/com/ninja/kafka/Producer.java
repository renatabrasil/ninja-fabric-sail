package br.com.ninja.kafka;

import br.com.ninja.designpatterns.strategy.VehicleSelectorStrategy;
import br.com.ninja.designpatterns.strategy.VehicleSelectorStrategyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private VehicleSelectorStrategy vehicleSelectorStrategy;

    @Autowired
    public Producer(VehicleSelectorStrategy vehicleSelectorStrategy) {
        this.vehicleSelectorStrategy = vehicleSelectorStrategy;
    }

    public void sendMessage(String message) {
        vehicleSelectorStrategy.execute(message, "");
    }
}
