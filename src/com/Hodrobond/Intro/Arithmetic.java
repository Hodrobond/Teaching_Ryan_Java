package com.Hodrobond.Intro;

import sun.font.Script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by hodrobond on 6/27/17.
 */
public class Arithmetic {

    public static double doArithmetic(double a, double b, char operand){
        double answer = 0;
        try{
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            answer = Double.parseDouble(engine.eval("" + a + operand + b).toString());
        }
        catch(ScriptException e){

        }
        return answer;
    }
}
