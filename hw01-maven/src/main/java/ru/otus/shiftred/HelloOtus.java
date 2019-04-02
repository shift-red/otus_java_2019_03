package ru.otus.shiftred;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.List;

class HelloOtus {
    private static final String HELLO = "Hello";
    private static final String OTUS = "Otus";
    private static final String EXCLAMATION_MARK = "!";

    static String guavaCall() {
        return Joiner.on(" ").join(getStringListToJoin());
    }

    private static List<String> getStringListToJoin() {
        return Arrays.asList(HELLO, OTUS, EXCLAMATION_MARK);
    }
}