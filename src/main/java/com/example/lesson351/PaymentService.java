package com.example.lesson351;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughtMoneyException();
    }

}
