package ru.otus.shiftred;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloOtusTest {

    @Test
    void guavaCallTest() {
        Assertions.assertEquals(HelloOtus.guavaCall(), "Hello Otus !");
    }
}
