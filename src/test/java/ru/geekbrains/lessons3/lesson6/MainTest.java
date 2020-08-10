package ru.geekbrains.lessons3.lesson6;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void test1() {
        Assert.assertArrayEquals(new int[]{8, 9, 10}, Main.task1(new int[]{1, 4, 3, 2, 4, 6, 4, 8, 9, 10}));
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(new int[]{3, 3, 2, 2, 2, 1, 0}, Main.task1(new int[]{1, 1, 4, 3, 3, 2, 2, 2, 1, 0}));
    }

    @Test(expected = RuntimeException.class)
    public void test3() {
        Assert.assertEquals("", Main.task1(new int[]{1, 1, 2, 2}));
    }

    @Test
    public void task4() {
        Assert.assertFalse("", Main.task2(new int[]{1, 1, 1}));
    }

    @Test
    public void task5() {
        Assert.assertTrue("", Main.task2(new int[]{1, 4, 1}));
    }

    @Test
    public void task6() {
        Assert.assertFalse("", Main.task2(new int[]{2, 3, 2, 5}));
    }
}