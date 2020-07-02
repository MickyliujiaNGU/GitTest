package com.leiga;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestConsist {
    static {
        System.out.println("TestConst");
    }

    public static final String test_String = "hello world";
    public static final int CONST_NUM = 321;
    public static final Lock lock=new ReentrantLock();
    public static final Random random=new Random(47);
}
