package com.example;
import java.util.*;
import java.util.function.*;

public class Greeting {
    public static void sayHi() {
        System.out.println("Hi!");
        // Object x = null; x.hashCode();
    }

    public static void testMap(String p) {
        Map<String,String> foo = new HashMap<>();
        Consumer<String> cons = q -> {
            if (foo.containsKey(q)) {
                System.out.println(foo.get(q).length());
            }
        };
    }
}
