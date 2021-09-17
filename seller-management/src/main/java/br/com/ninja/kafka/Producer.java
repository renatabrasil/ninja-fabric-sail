package br.com.ninja.kafka;

import br.com.ninja.poc.factory_method.VehicleProducerSelectorStrategy;
import br.com.ninja.poc.factory_method.VehicleSelectorStrategyImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private VehicleProducerSelectorStrategy producerFactory;

    @Autowired
    public Producer(VehicleSelectorStrategyImpl producerFactory) {
        this.producerFactory = producerFactory;
    }

    public void sendMessage(String message) {
        producerFactory.produce(message, "");
    }
}
