package br.com.ninja.designpatterns.strategy;

import br.com.ninja.designpatterns.strategy.strategies.VehicleStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class VehicleSelectorStrategyImpl implements VehicleSelectorStrategy {

    private List<VehicleStrategy> vehicleStrategies;

    @Autowired
    public VehicleSelectorStrategyImpl(List<VehicleStrategy> vehicleStrategies) {
        this.vehicleStrategies = vehicleStrategies;
    }

    public VehicleStrategy getVehicle(String channel) {
        return vehicleStrategies.stream().filter(it -> it.canDrive(channel)).findFirst().orElse(null);
    }

    public void execute(String payload, String eventType) {
        VehicleStrategy vehicleStrategy = getVehicle(eventType);
        if (Objects.nonNull(vehicleStrategy)) {
            vehicleStrategy.drive();
        }

        // Lança exceção
    }

}
