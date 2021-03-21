package com.ptc;

import java.util.Stack;

public class BalanceParenthesis {

    Stack<Character> stack = new Stack<>();

    public boolean balanceParenthesis(String input){

        for (int i = 0; i< input.length();i++){

            if(input.charAt(i) == '('){
                stack.push(input.charAt(i));
            }else
                stack.pop();
        }

        if (stack.isEmpty() == true)
            return true;
        else
            return false;



    }
}
