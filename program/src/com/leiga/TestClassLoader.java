package com.leiga;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> aClass = myClassLoader.findClass("com.leiga.HelloWorld");
        Method helloWorld = aClass.getDeclaredMethod("welcome");
        Object o = aClass.newInstance();
        Object invoke = helloWorld.invoke(o);
        System.out.println(invoke);
    }
}
