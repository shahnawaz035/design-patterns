package com.shah.patters.decorator;

public class SimpleAccount implements Account{
    @Override
    public void features(){
        System.out.println("Simple features");
    }
}
