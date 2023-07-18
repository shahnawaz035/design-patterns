package com.shah.patters.decorator;

public class PlatinumAccount extends DecoratorAccount{
    PlatinumAccount(Account account) {
        super(account);
    }

    @Override
    public void features() {
        super.features();
        System.out.println("Adding Platinum Features");
    }
}
