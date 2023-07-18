package com.shah.patters.factory;

public class PersonFactory {

    public static Person getPerson(String personType){
        switch(personType){
            case "M": return new Male();
            default: return new Female();
        }
    }
}
