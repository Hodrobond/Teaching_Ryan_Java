package com.Hodrobond.OneOffs

/**
 * Created by hodrobond on 6/27/17.
 */

import com.Hodrobond.OneOffs.ClosestToNotOver;

class ClosestToNotOverTest extends GroovyTestCase {
    ClosestToNotOver closestToNotOver = new ClosestToNotOver();
    void testMain1() {
        double answer = closestToNotOver.main(1, 5, 10);
        assertEquals(5, answer);
    }

    void testMain2() {
        double answer = closestToNotOver.main(11, 5, 10);
        assertEquals(5, answer);
    }

    void testMain3() {
        double answer = closestToNotOver.main(-1, -5, -10);
        assertEquals(0, answer);
    }

    void testMain4() {
        double answer = closestToNotOver.main(-101, -99, -100);
        assertEquals(-101, answer);
    }

    void testMain5() {
        double answer = closestToNotOver.main(5, 5, 10);
        assertEquals(0, answer);
    }
}
