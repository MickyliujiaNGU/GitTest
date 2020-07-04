package com.leiga;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestNullPoint {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<TestModel> list = new ArrayList<>();
        long begin =System.currentTimeMillis();
int a=1;
        for (int i = 0; i < 30000000; i++) {
            TestModel testModel = new TestModel();
            testModel.setTest1("aaaaasdsadadad");
            testModel.setTest2("aaaaasdsadadad");
            testModel.setTest3("aaaaasdsadadad");
            testModel.setTest4("aaaaasdsadadad");
            testModel.setTest5("aaaaasdsadadad");
            testModel.setTest6("aaaaasdsadadad");
            testModel.setTest7("aaaaasdsadadad");
            testModel.setTest8("aaaaasdsadadad");
            testModel.setTest9("aaaaasdsadadad");
            testModel.setTest10("aaaaasdsadadad");
            testModel.setTest12("aaaaasdsadadad");
            testModel.setTest13("aaaaasdsadadad");
            testModel.setTest14("aaaaasdsadadad");
            testModel.setTest15("aaaaasdsadadad");
            testModel.setTest16("aaaaasdsadadad");
            testModel.setTest17("aaaaasdsadadad");
            testModel.setTest18("aaaaasdsadadad");
            testModel.setTest19("aaaaasdsadadad");
            testModel.setTest20("aaaaasdsadadad");
            testModel.setTest21("aaaaasdsadadad");
            testModel.setTest22("aaaaasdsadadad");
            testModel.setTest23("aaaaasdsadadad");
            testModel.setTest24("aaaaasdsadadad");
            testModel.setTest25("aaaaasdsadadad");
            testModel.setTest26("aaaaasdsadadad");

            list.add(testModel);
        }
        System.out.println("执行时间:"+(System.currentTimeMillis()-begin));
        TimeUnit.MINUTES.sleep(1);
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
