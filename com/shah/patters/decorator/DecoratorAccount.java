package com.shah.patters.decorator;

public abstract  class DecoratorAccount implements Account{

    private Account account;

    DecoratorAccount(Account account){
        this.account=account;
    }

    @Override
    public void features(){
        account.features();
    }
}
