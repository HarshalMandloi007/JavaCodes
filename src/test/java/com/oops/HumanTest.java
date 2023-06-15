package com.oops;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HumanTest {
    Human h = new Human();

    @Test
    public void should_eat_property() {
        assertTrue(h.eat() == "Eating");
    }

    @Test
    public void should_walk_property() {
        assertTrue(h.walk() == "Walking");
    }
}