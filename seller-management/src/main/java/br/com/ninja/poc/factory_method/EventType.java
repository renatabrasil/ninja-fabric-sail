package br.com.ninja.poc.factory_method;

public enum EventType {
    BRANCH_CREATION("pagamentos-quebra-de-sigilo-agencia-conta", "ComandoQuebraSigilo");

    private String topic;
    private String className;
    EventType(String topic, String className) {
        this.topic = topic;
        this.className = className;
    }

    public String getTopic() {
        return topic;
    }

    public String getClassName() {
        return className;
    }
}
