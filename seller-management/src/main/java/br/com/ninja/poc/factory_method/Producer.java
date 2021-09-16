package br.com.ninja.poc.factory_method;

public interface Producer {
    boolean canProduce(String event);
    void produce(String payload);
}
