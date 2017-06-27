package com.Hodrobond.OneOffs

/**
 * Created by hodrobond on 6/27/17.
 */

import com.Hodrobond.OneOffs.ConvertNumbersToLetters;

class ConvertNumbersToLettersTest extends GroovyTestCase {
    ConvertNumbersToLetters convertNumbersToLetters = new ConvertNumbersToLetters();
    void testMain1() {
        String answer = convertNumbersToLetters.main(8,5,12,12,15,23,15,18,12,4);
        assertEquals("helloworld", answer);
    }

    void testMain2(){
        String answer = convertNumbersToLetters.main(8,9,18,25,1,14);
        assertEquals("hiryan", answer);
    }
}
