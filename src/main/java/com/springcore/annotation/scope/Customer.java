package com.springcore.annotation.scope;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Log4j2
@Scope("prototype")
@Component
public class Customer {
    private int customerId;
    private String customerName;

    public void getCustomer(){
        log.info("Customer Id;{} and customer name:{}", customerId, customerName);
    }
}
