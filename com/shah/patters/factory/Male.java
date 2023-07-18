package com.shah.patters.factory;

public class Male implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Male Wish - "+msg);
    }
}
