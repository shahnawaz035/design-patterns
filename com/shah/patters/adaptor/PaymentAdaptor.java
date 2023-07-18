package com.shah.patters.adaptor;

public class PaymentAdaptor {

    public void pay(int rupees){
        int dollar = rupees/60;
        PaymentProcessor paymentProcessor=new PaymentProcessImpl();
        paymentProcessor.pay(dollar);
    }
}
