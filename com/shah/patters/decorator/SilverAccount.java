package com.shah.patters.decorator;

public class SilverAccount extends DecoratorAccount{

    SilverAccount(Account account) {
        super(account);
    }

    @Override
    public void features() {
        super.features();
        System.out.println("Adding Silver features");
    }
}
