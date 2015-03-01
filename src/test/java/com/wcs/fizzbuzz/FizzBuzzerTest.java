package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void executeShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("fizz", fizzBuzzer.execute(6));
        assertEquals("fizz", fizzBuzzer.execute(9));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("buzz", fizzBuzzer.execute(5));
        assertEquals("buzz", fizzBuzzer.execute(10));
    }

    @Test
    public void executeShouldReturnWizzIfTheNumberIsDividableBy7() {
        assertEquals("wizz", fizzBuzzer.execute(7));
        assertEquals("wizz", fizzBuzzer.execute(14));
    }

    @Test
    public void executeShouldReturnFizzBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(15));
        assertEquals("fizzbuzz", fizzBuzzer.execute(45));
    }

    @Test
    public void executeShouldReturnFizzWizzIfTheNumberIsDividableBy21() {
        assertEquals("fizzwizz", fizzBuzzer.execute(21));
        assertEquals("fizzwizz", fizzBuzzer.execute(42));
    }

    @Test
    public void executeShouldReturnBuzzWizzIfTheNumberIsDividableBy35() {
        assertEquals("buzzwizz", fizzBuzzer.execute(70));
        assertEquals("buzzwizz", fizzBuzzer.execute(140));
    }

    @Test
    public void executeShouldReturnFizzBuzzWizzIfTheNumberIsDividableBy105() {
        assertEquals("fizzbuzzwizz", fizzBuzzer.execute(105));
        assertEquals("fizzbuzzwizz", fizzBuzzer.execute(210));
    }
    
    @Test
    public void executeShouldReturnFizzIfTheNumberIsContains3() {
        assertEquals("fizz", fizzBuzzer.execute(13));
        assertEquals("fizz", fizzBuzzer.execute(131));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
        assertEquals("8", fizzBuzzer.execute(8));
    }
}
