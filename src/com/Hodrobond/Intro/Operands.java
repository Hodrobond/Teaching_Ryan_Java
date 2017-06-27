package com.Hodrobond.Intro;

/**
 * Created by hodrobond on 6/27/17.
 */
public class Operands {
    public static Boolean isOperand(char input){
        switch(input){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
            default:
                return false;
        }
    }
}
