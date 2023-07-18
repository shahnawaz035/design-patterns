package com.shah.patters.adaptor;

public class PaymentProcessImpl implements PaymentProcessor{

    @Override
    public void pay(int dollars) {
        System.out.println("Amount in dollars :" +dollars);
    }
}
