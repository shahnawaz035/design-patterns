package com.shah.patters.singleton;

public class DateUtil {
    private static DateUtil instance;

    public static DateUtil getInstance() {
        return instance = instance==null ? new DateUtil() : instance;

    }
}
