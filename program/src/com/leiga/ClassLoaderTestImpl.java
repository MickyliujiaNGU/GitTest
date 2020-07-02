package com.leiga;

import java.util.HashMap;

public class ClassLoaderTestImpl extends ClassLoaderTest {
    static {
        System.out.println("subClass is loader");
    }
    public static String sub_String = "sfs";
}
