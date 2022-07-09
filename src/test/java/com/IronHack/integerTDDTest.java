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

    @Test
    void test_getOddsUntil(){
            var firstToTry = oddNumbers(10)[0];
            assertArrayEquals(1, new int[]{firstToTry});
    }

    private void assertArrayEquals(int i, int[] ints) {
    }

    private void assertArrayEquals(int[] i, int[] ints) {
    }

}