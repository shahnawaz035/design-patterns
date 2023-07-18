package com.shah.patters.decorator;

public class AccountProcessor {

    public static void main(String[] args) {
        Account baseAccount = new SimpleAccount();

        Account silverAccount = new SilverAccount(baseAccount);
        silverAccount.features();
        Account goldAccount = new GoldAccount(silverAccount);
        goldAccount.features();
        Account platinumAccount = new PlatinumAccount(goldAccount);
        platinumAccount.features();
        Account vipAccount = new VipAccount(goldAccount);
        vipAccount.features();
    }
}
