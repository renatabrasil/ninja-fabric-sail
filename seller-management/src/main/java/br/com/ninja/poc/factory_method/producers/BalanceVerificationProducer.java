package br.com.ninja.poc.factory_method.producers;

import br.com.ninja.poc.factory_method.Producer;

public class BalanceVerificationProducer implements Producer {
    @Override
    public boolean canProduce(String event) {
        return false;
    }

    @Override
    public void produce(String payload) {

    }
}
