package com.Hodrobond.OneOffs

/**
 * Created by hodrobond on 6/27/17.
 */

import com.Hodrobond.OneOffs.ClosestTo;

class ClosestToTest extends GroovyTestCase {
    ClosestTo closestTo = new ClosestTo();
    void testMain1() {
        double answer = closestTo.main(1, 5, 10);
        assertEquals(5, answer);
    }

    void testMain2() {
        double answer = closestTo.main(11, 5, 10);
        assertEquals(11, answer);
    }

    void testMain3() {
        double answer = closestTo.main(-1, -5, -10);
        assertEquals(-5, answer);
    }

    void testMain4() {
        double answer = closestTo.main(-100, -99, -100);
        assertEquals(-100, answer);
    }

    void testMain5() {
        double answer = closestTo.main(5, 5, 10);
        assertEquals(0, answer);
    }

}
