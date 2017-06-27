package com.Hodrobond.OneOffs

/**
 * Created by hodrobond on 6/27/17.
 */

import com.Hodrobond.OneOffs.Fibonacci;

class FibonacciTest extends GroovyTestCase {
    Fibonacci fibonacci = new Fibonacci();
    void testMain1() {
        double answer = fibonacci.main(1);
        assertEquals(1, answer);
    }
    void testMain2() {
        double answer = fibonacci.main(2);
        assertEquals(1, answer);
    }
    void testMain3() {
        double answer = fibonacci.main(3);
        assertEquals(2, answer);
    }
    void testMain4() {
        double answer = fibonacci.main(4);
        assertEquals(3, answer);
    }
    void testMain5() {
        double answer = fibonacci.main(5);
        assertEquals(5, answer);
    }
    void testMain6() {
        double answer = fibonacci.main(50);
        double solution = 12586269025
        assertEquals(solution, answer);
    }

}
