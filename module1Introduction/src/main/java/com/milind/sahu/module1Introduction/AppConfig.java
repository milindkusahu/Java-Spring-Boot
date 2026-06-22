package com.milind.sahu.module1Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    PaymentService paymentService() {
        // If needed we can add more logic here
        return  new PaymentService();
    }
}
