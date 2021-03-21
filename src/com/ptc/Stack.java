package com.ptc;

public class Stack {

    static final int MAX = 1000;

    int array[]  = new int[MAX];

    int pointer ;

    Stack(){
        //Initialization of variable is done in constructor
        pointer = -1;
    }

    public boolean push(int element){

        //overflow condition
        if(pointer >= array.length -1){
            System.out.println("Element::"+element+"can't pushed overflow condition");
            return false;
        }

        array[++pointer] = element;
        return true;

    }

    public int pop(){

        int element;

        //underflow condition
        if(pointer < 0){
            System.out.println("Pop can't performed add some element first");
            return 0;
        }
        element = array[pointer];
        pointer--;

        return element;
    }

    public int peep(){
        int element;

        if(pointer < 0){
            System.out.println("No element to peep add some element first");
            return 0;

        }

        element = array[pointer];

        return element;
    }



}
