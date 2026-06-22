package com.milind.sahu.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// This class object of which will be managed by Spring boot IOC container
@Component
public class PaymentService {

    public void pay() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("Before paying");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("After payment is done");
    }
}
