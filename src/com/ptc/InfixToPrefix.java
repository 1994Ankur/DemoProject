package com.ptc;

import java.util.Stack;

public class InfixToPrefix {

    // Stack used for internal computation
    Stack<Character> stack = new Stack<>();

    //result to store the output expression
    String result;

    InfixToPrefix(){

        result = new String("");
    }


    //Utility function to return the precendence of the operator higher number means higher precendence
    public int Prec(char ch){

        switch (ch){
            case '+':
            case '-':
                return 1;
            case  '*':
            case  '/':
                return 2;
            case  '^':
                return 3;
        }

        return -1;
    }



    public String infixToPrefix(String exp){

        //Modififed reverse string for prefix conversion
        StringBuffer mexp = new StringBuffer(exp);
        mexp.reverse();

        for (int i = 0 ; i < mexp.length();i++){

            //if it is an operand append it to the result
            if(Character.isLetterOrDigit(mexp.charAt(i))){

                result += mexp.charAt(i);

            }

            //If it is left parentheses push it on the stack
            else if (mexp.charAt(i) == '('){

                stack.push(mexp.charAt(i));
            }

            //if it is right parenthese pop all elements
            else if(mexp.charAt(i) == ')'){
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();

                stack.pop();
            }

            //if it is an operator
            else {

                while (!stack.isEmpty() && Prec(stack.peek()) > Prec(mexp.charAt(i))){
                    result += stack.pop();
                }

                stack.push(mexp.charAt(i));
            }



        }

        while(!stack.isEmpty()){

            result+=stack.pop();
        }







        return result;
    }
}
