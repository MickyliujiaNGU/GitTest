package com.leiga;

import java.util.concurrent.TimeUnit;

public class VolatileKeyWordTest {
    public static boolean flag = true;

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1_000);
                flag = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        while (flag) {

        }
    }

}
