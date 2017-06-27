package com.Hodrobond.Intro

/**
 * Created by hodrobond on 6/27/17.
 */

import com.Hodrobond.Intro.Operands;

class EquationParserTest extends GroovyTestCase {
    void testParseEquation() {
        EquationParser equationParser = new EquationParser();
        String eq = "5+6";
        equationParser.parseEquation(eq);
        Stack testNumStack = new ArrayList();
        testNumStack.addAll([5,6]);
        Stack testOpStack = new ArrayList();
        testOpStack.addAll(['+']);

        for(int i=0; i<testNumStack.size(); i++){
            assertEquals(testNumStack.get(i), equationParser.numberStack.get(i));
        }
        for(int i=0; i<testOpStack.size(); i++){
            assertEquals(testOpStack.get(i), equationParser.operandStack.get(i));
        }
    }

    void testParseEquation2() {
        EquationParser equationParser = new EquationParser();
        String eq = "5+6-11*33/987654321";
        equationParser.parseEquation(eq);

        Stack testNumStack = new ArrayList();
        testNumStack.addAll([5,6,11,33,987654321]);
        Stack testOpStack = new ArrayList();
        testOpStack.addAll(['+','-','*','/']);

        for(int i=0; i<testNumStack.size(); i++){
            assertEquals(testNumStack.get(i), equationParser.numberStack.get(i));
        }
        for(int i=0; i<testOpStack.size(); i++){
            assertEquals(testOpStack.get(i), equationParser.operandStack.get(i));
        }
    }

    void testEvaluateEquation1(){
        EquationParser equationParser = new EquationParser();
        String eq = "5+6";
        double answer = equationParser.evaluateEquation(eq);
        assertEquals(11, answer);
    }

    void testEvaluateEquation2(){
        EquationParser equationParser = new EquationParser();
        String eq = "5+7-11*33/3";
        double answer = equationParser.evaluateEquation(eq);
        assertEquals(11, answer);
    }

    void testIsOperandTrue() {
        EquationParser equationParser = new EquationParser();
        assertEquals(true, EquationParser.isNumber((char)'1'));
    }
    void testIsOperandFalse() {
        EquationParser equationParser = new EquationParser();
        assertEquals(false, EquationParser.isNumber((char)'*'));
    }
}
