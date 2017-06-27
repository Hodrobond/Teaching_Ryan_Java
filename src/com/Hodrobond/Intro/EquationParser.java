package com.Hodrobond.Intro;

import java.util.ArrayList;
import com.Hodrobond.Intro.Operands;
import com.Hodrobond.Intro.Arithmetic;
import java.lang.String;


/**
 * Created by hodrobond on 6/27/17.
 */
public class EquationParser {
    //These are utility classes defined elsewhere
    static Operands operands = new Operands();
    static Arithmetic arithmetic = new Arithmetic();

    //These are pre-emptive data structures
    public ArrayList<Double> numberStack;
    public ArrayList<Character> operandStack;

    //Constructor
    public EquationParser(){
        this.numberStack = new ArrayList<Double>();
        this.operandStack = new ArrayList<Character>();
    }

    //Please write a function that will take an input, and push the operands and numbers onto their respective ArrayLists
    //For example, if the equation given is "5+3-2*123", the ArrayLists should contain:
    //numberStack: [5,3,2,123]
    //operandStack: ['+','-','*']
    public void parseEquation(String input){
        for(int i= 0; i < input.length(); i++){
            char part = input.charAt(i);
            if(isNumber(part)){
                java.lang.String tempNum = "";
                part = input.charAt(i);
                while(this.isNumber(part) && i < input.length()){
                    tempNum += part;
                    i++;
                    if(i < (input.length())){
                        part = input.charAt(i);
                    }
                }
                i--;
                this.numberStack.add(Double.parseDouble(tempNum));
            }
            else{
                this.operandStack.add(part);
            }
        }
    }

    //Please write a function to evaluate an equation completely.
    //Order of operations need not be considered.
    //Operators to consider are [+, -, *, /]
    //Assume all input will be valid, without whitespace.
    //There will only be one operator between numbers which may be multiple digits long
    public double evaluateEquation(String input){
        this.parseEquation(input);
        double solution = this.numberStack.get(0);
        this.numberStack.remove(0);
        for(int i=0; i<this.numberStack.size(); i++){
            solution = arithmetic.doArithmetic(solution, this.numberStack.get(i), this.operandStack.get(i));
        }
        return solution;
    }

    //Please write a function to determine whether or not a character is a number
    public static Boolean isNumber(char input){
        return !operands.isOperand(input);
    }
}
