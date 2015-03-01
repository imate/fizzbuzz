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
        assertEquals("buzz", fizzBuzzer.execute(10));
        assertEquals("buzz", fizzBuzzer.execute(20));
    }

    @Test
    public void executeShouldReturnWizzIfTheNumberIsDividableBy7() {
        assertEquals("wizz", fizzBuzzer.execute(14));
        assertEquals("wizz", fizzBuzzer.execute(28));
    }

    @Test
    public void executeShouldReturnFizzBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(60));
        assertEquals("fizzbuzz", fizzBuzzer.execute(90));
    }

    @Test
    public void executeShouldReturnFizzWizzIfTheNumberIsDividableBy21() {
        assertEquals("fizzwizz", fizzBuzzer.execute(21));
        assertEquals("fizzwizz", fizzBuzzer.execute(42));
    }

    @Test
    public void executeShouldReturnBuzzWizzIfTheNumberIsDividableBy35() {
        assertEquals("buzzwizz", fizzBuzzer.execute(140));
        assertEquals("buzzwizz", fizzBuzzer.execute(280));
    }

    @Test
    public void executeShouldReturnFizzBuzzWizzIfTheNumberIsDividableBy105() {
        assertEquals("fizzbuzzwizz", fizzBuzzer.execute(210));
        assertEquals("fizzbuzzwizz", fizzBuzzer.execute(420));
    }
    
    @Test
    public void executeShouldReturnFizzIfTheNumberIsContains3() {
        assertEquals("fizz", fizzBuzzer.execute(13));
        assertEquals("fizz", fizzBuzzer.execute(131));
    }
    
    @Test
    public void executeShouldReturnBuzzIfTheNumberIsContains5() {
        assertEquals("buzz", fizzBuzzer.execute(151));
        assertEquals("buzz", fizzBuzzer.execute(851));
    }
    
    @Test
    public void executeShouldReturnWizzIfTheNumberIsContains7() {
        assertEquals("wizz", fizzBuzzer.execute(179));
        assertEquals("wizz", fizzBuzzer.execute(79));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
        assertEquals("8", fizzBuzzer.execute(8));
    }
}
