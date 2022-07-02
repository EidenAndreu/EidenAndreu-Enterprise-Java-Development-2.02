package com.IronHack;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {

    public void testDecrementLives() {
        Warrior mario = new Warrior("mario",10,50,3,5);
        mario.decrementLives();
        assertEquals(100,mario.getHealth());
        assertEquals(2,mario.getLives());
    }
}