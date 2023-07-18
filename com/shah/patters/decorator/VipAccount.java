package com.shah.patters.decorator;

public class VipAccount extends DecoratorAccount{
    VipAccount(Account account) {
        super(account);
    }

    @Override
    public void features() {
        super.features();
        System.out.println("Adding VIP features");
    }
}
