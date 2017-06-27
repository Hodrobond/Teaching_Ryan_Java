package com.Hodrobond.Intro

import org.junit.Test

/**
 * Created by hodrobond on 6/27/17.
 */
class generalArithmeticTest extends GroovyTestCase {
    GeneralArithmetic arithmetic = new GeneralArithmetic();

    void testAddWhole() {
        assertEquals(arithmetic.add(2,4), 6);
    }

    void testAddPartial(){
        assertEquals(arithmetic.add(0.3, 0.8), 1.1);
    }

    void testSubtractWhole() {
        assertEquals(arithmetic.subtract(4,2), 2);
    }

    void testSubtractPartial() {
        assertEquals(arithmetic.subtract(0.44,0.22), 0.22);
    }

    void testMultiplyWhole() {
        assertEquals(arithmetic.multiply(2,4), 8);
    }

    void testMultiplyPartial() {
        assertEquals(arithmetic.multiply(10,0.5), 5);
    }

    void testDivideWhole() {
        assertEquals(arithmetic.divide(6,3), 2);
    }

    void testDividePartial() {
        assertEquals(arithmetic.divide(6,0.3), 20);
    }
}
