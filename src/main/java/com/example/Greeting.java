package com.example;
import java.util.*;

public class Greeting {
    public static void sayHi() {
        System.out.println("Hi!");
    }

    public static void testMap(String p) {
        Map<String,String> foo = new HashMap<>();
        if (foo.containsKey(p)) {
            System.out.println(foo.get(p).length());
        }
    }
}
