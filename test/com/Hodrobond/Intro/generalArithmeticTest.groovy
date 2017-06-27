package com.Hodrobond.Intro

import org.junit.Test

/**
 * Created by hodrobond on 6/27/17.
 */
class generalArithmeticTest extends GroovyTestCase {
    GeneralArithmetic arithmetic = new GeneralArithmetic();

    void testAddWhole() {
        assertEquals(6, arithmetic.add(2,4));
    }

    void testAddPartial(){
        assertEquals(1.1, arithmetic.add(0.3, 0.8));
    }

    void testSubtractWhole() {
        assertEquals(2, arithmetic.subtract(4,2));
    }

    void testSubtractPartial() {
        assertEquals(0.22, arithmetic.subtract(0.44,0.22));
    }

    void testMultiplyWhole() {
        assertEquals(8, arithmetic.multiply(2,4));
    }

    void testMultiplyPartial() {
        assertEquals(5, arithmetic.multiply(10,0.5));
    }

    void testDivideWhole() {
        assertEquals(2, arithmetic.divide(6,3));
    }

    void testDividePartial() {
        assertEquals(20, arithmetic.divide(6,0.3));
    }
}
