package com.shah.patters.factory;

public class Female implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Female Wish - "+msg);
    }
}
