package com.Hodrobond.OneOffs

/**
 * Created by hodrobond on 6/27/17.
 */

import com.Hodrobond.OneOffs.Factorial;

class FactorialTest extends GroovyTestCase {
    Factorial factorial = new Factorial();
    void testMain1() {
        double answer = factorial.main(1);
        assertEquals(1, answer);
    }
    void testMain2() {
        double answer = factorial.main(2);
        assertEquals(2, answer);
    }
    void testMain3() {
        double answer = factorial.main(3);
        assertEquals(6, answer);
    }
    void testMain4() {
        double answer = factorial.main(5);
        assertEquals(120, answer);
    }
    void testMain5() {
        double answer = factorial.main(10);
        assertEquals(3628800, answer);
    }
}
