package br.com.ninja.poc.factory_method;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public class FinancialSecrecyProducerFactoryImpl implements FinancialSecrecyProducerFactory {

    @Autowired
    List<Producer> producers;

    public Producer getProducer(String event) {
        return producers.stream().filter(it -> it.canProduce(event)).findFirst().orElse(null);
    }

    public void produce(String payload, String eventType) {
        Producer producer = getProducer(eventType);
        if (Objects.nonNull(producer)) {
            producer.produce(payload);
        }

        // Lança exceção
    }

}
