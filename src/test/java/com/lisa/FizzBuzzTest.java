package com.lisa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {

    @Test
    void goHappyPath() {
        //given

        //when
        final String results = FizzBuzz.fizzBuzz(20);

        //then
        assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz", results);
    }
}
