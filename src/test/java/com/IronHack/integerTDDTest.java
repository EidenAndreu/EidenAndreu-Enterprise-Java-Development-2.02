package com.IronHack;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static com.IronHack.integerTDD.oddNumbers;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class integerTDDTest extends TestCase {
        @Test
    public void testOddNumbers() {

        assertArrayEquals(new int[] {1, 3, 5, 7, 9}, oddNumbers(9));
        assertArrayEquals(new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29}, oddNumbers(29));
    }


}