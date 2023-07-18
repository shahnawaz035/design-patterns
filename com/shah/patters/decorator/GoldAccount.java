package com.shah.patters.decorator;

public class GoldAccount extends DecoratorAccount{
    GoldAccount(Account account) {
        super(account);
    }

    @Override
    public void features() {
        super.features();
        System.out.println("Adding Gold features");
    }
}
