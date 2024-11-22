package com.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testSum() {
        int a = 20;
        int b = 30;
        int expected = 50;
        int actual = Main.sum(a,b);
        Assertions.assertEquals(expected, actual);

    }
}