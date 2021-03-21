package com.ptc;

public class InputHandler {

     InputHandler(String input){

         BalanceParenthesis balanceParenthesis = new BalanceParenthesis();

        //String result=  infixtoPostfix.infixToPostfix(input);
         if(balanceParenthesis.balanceParenthesis(input))
            System.out.println("balance");
            else
                System.out.println("Not balance");



       // System.out.println("Output String" +my.reverse());

     }


}
