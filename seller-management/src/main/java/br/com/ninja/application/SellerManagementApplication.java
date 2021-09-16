package br.com.ninja.application;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SellerManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SellerManagementApplication.class, args);
    }

    @Bean
    public NewTopic topic() {
//		Properties props = new Properties();
//		props.setProperty(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        return new NewTopic("pagamento", 1, (short) 1);
    }
}
