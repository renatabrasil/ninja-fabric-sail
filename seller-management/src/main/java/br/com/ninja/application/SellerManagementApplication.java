package br.com.ninja.application;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SellerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerManagementApplication.class, args);
	}

	@Bean
	public NewTopic createTopic() {
		return new NewTopic("pagamento", 1, (short) 1);
	}
}
