package com.leiga;

public class ClassLoaderTestImpl extends ClassLoaderTest {
    static {
        System.out.println("subClass is loader");
    }

    public static String sub_String = "sfs";
}
