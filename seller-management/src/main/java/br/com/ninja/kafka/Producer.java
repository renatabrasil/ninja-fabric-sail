package br.com.ninja.kafka;

import br.com.ninja.poc.factory_method.FinancialSecrecyProducerFactory;
import br.com.ninja.poc.factory_method.FinancialSecrecyProducerFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private FinancialSecrecyProducerFactory producerFactory;

    @Autowired
    public Producer(FinancialSecrecyProducerFactoryImpl producerFactory) {
        this.producerFactory = producerFactory;
    }

    public void sendMessage(String message) {
        producerFactory.produce(message, "");
    }
}
