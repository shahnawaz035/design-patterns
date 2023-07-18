package com.shah.patters.singleton;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {

    private static volatile Logger instance;
    private String message;

    private Logger(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public static Logger getInstance(String message) {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger(message);
                }
            }
        }
        return instance;
    }

    @Override
    public Logger clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return instance;
    }
}
