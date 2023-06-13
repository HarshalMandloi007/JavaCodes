package com.oops;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HumanTest{
    Human h = new Human();

@Test
    public void testEat() {
    assertTrue(h.eat() == "Eating");
    }
@Test
    public void testWalk() {
    assertTrue(h.walk() == "Walking");
    }
}