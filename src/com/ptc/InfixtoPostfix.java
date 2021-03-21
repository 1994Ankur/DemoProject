package com.ptc;

import java.util.Stack;

public class InfixtoPostfix {

    //Utility function to return the priority of operator higher value higher the priority

    public int Prec(char ch){

        switch (ch){

            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
             return 3;
        }

        return  -1;

    }

    //Main method that converts infix to postfix

    public String infixToPostfix(String exp){

        //Initalizing empty string for result
        String result = new String("");

        //Intializing stack for the computation
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < exp.length(); i++){

            char present = exp.charAt(i);

            //If the scanned charater is letter or digit
            if(Character.isLetterOrDigit(present)){

                result += present;
            }

            //If it is left parenthies push it on stack
            else if (present == '('){
                stack.push(present);

            }

            //If the scanned character is '(' pop the element unless ')' arrieved

            else if (present == ')' ){

                while( !stack.isEmpty() && stack.peek()!= '(')
                    result += stack.pop();

                stack.pop();
            }

            //character is a operator

            else {

                while (!stack.isEmpty() && Prec(present) <=Prec(stack.peek()))
                    result +=stack.pop();


                stack.push(present);

            }

        }

        //POP all the remaining element

        while (!stack.isEmpty()){

            if(stack.peek() == '(')
                return "Invalid Expression";

            result +=stack.pop();
        }

        System.out.println(result);

        return result;
    }



}
