package br.com.ninja.poc.factory_method.producers;

import br.com.ninja.domain.CriarEAtualizarConta;
import br.com.ninja.poc.factory_method.EventType;
import br.com.ninja.poc.factory_method.Producer;
import org.springframework.kafka.core.KafkaTemplate;

public class BranchCreationProducer implements Producer {

    private KafkaTemplate<String, CriarEAtualizarConta> kafkaTemplate;

    @Override
    public boolean canProduce(String event) {
        return event.equalsIgnoreCase(EventType.BRANCH_CREATION.getClassName());
    }

    @Override
    public void produce(String payload) {
//        kafkaTemplate.send;
    }
}
