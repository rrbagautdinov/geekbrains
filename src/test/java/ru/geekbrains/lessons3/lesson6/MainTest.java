package ru.geekbrains.lessons3.lesson6;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class MainTest {

    @Test
    void test1() {
        Assert.assertArrayEquals(new int[]{8, 9, 10}, Main.task1(new int[]{1, 4, 3, 2, 4, 6, 4, 8, 9, 10}));
    }

    @Test
    void test2() {
        Assert.assertArrayEquals(new int[]{3, 3, 2, 2, 2, 1, 0}, Main.task1(new int[]{1, 1, 4, 3, 3, 2, 2, 2, 1, 0}));
    }

    @Test (expected = RuntimeException.class)
    void test3() {
        Assert.assertEquals(RuntimeException, Main.task1(new int[]{1, 1, 2, 2}));
    }
}

//    @Test
//    void task4() {
//
//    }
//
//    @Test
//    void task5() {
//    }
//
//    @Test
//    void task6() {
//    }
