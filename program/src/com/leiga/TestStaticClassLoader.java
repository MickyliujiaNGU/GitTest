package com.leiga;

import java.util.Random;
import java.util.concurrent.locks.Lock;

public class TestStaticClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
//        ClassLoaderTest loaderTest = new ClassLoaderTest();
//        ClassLoaderTest.method();
//        String testClassLoder = ClassLoaderTest.testClassLoder;
//        Class.forName("com.leiga.ClassLoaderTestImpl");
//        Random random = TestConsist.random;
//        Lock lock = TestConsist.lock;
//        int constNum = TestConsist.CONST_NUM;
        String test_string = TestConsist.test_String;
    }

}
