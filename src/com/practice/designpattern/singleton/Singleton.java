package com.practice.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private Map<Integer, String> map;

    private static Singleton singleton;

    private Singleton() {
        map = new HashMap<>();
    }

    public static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void putValue(Integer key, String value) {
        map.put(key, value);
    }

    public String getValue(Integer key) {
        return map.get(key);
    }
}
