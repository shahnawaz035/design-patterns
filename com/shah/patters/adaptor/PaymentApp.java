package com.shah.patters.adaptor;

public class PaymentApp {

    public void pay(int rupees){
        PaymentAdaptor paymentAdaptor = new PaymentAdaptor();
        paymentAdaptor.pay(rupees);
    }


}
