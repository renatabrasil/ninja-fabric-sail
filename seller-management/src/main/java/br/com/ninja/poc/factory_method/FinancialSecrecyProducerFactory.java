package br.com.ninja.poc.factory_method;

public interface FinancialSecrecyProducerFactory {
    Producer getProducer(String event);

    void produce(String payload, String event);
}
