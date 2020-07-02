package com.leiga;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ClassInit {
    static {
        try {
            TimeUnit.MILLISECONDS.sleep(4_000);
            System.out.println("static method was invoke");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IntStream.range(1, 5).forEach(i -> new Thread(ClassInit::new));
    }
}
