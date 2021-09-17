package br.com.ninja.poc.factory_method;

import br.com.ninja.poc.factory_method.strategies.VehicleStrategy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class VehicleSelectorStrategyImpl implements VehicleProducerSelectorStrategy {

    private List<VehicleStrategy> vehicleStrategies;

    @Autowired
    public VehicleSelectorStrategyImpl(List<VehicleStrategy> vehicleStrategies) {
        this.vehicleStrategies = vehicleStrategies;
    }

    public VehicleStrategy getVehicle(String channel) {
        return vehicleStrategies.stream().filter(it -> it.canDrive(channel)).findFirst().orElse(null);
    }

    public void produce(String payload, String eventType) {
        VehicleStrategy vehicleStrategy = getVehicle(eventType);
        if (Objects.nonNull(vehicleStrategy)) {
            vehicleStrategy.drive();
        }

        // Lança exceção
    }

}
