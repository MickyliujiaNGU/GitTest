package com.leiga;

public class TestSingleton {
    private static TestSingleton testSingleton = new TestSingleton();
    public static int x = 0;
    public static int y;

    private TestSingleton() {
        x++;
        y++;
    }

    public static TestSingleton getTestSingleton() {
        return testSingleton;
    }

    public static void main(String[] args) {
        TestSingleton testSingleton = TestSingleton.getTestSingleton();
        System.out.println(testSingleton.x);
        System.out.println(testSingleton.y);
    }
}
