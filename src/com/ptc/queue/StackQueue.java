package com.ptc.queue;
import java.io.*;
import  java.util.*;

public class StackQueue {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public  void enQueue(int item){

        //Move all element to the other stack
        while (!stack.isEmpty())
            stack2.push(stack.pop());

        stack2.push(item);

        while (!stack2.isEmpty())
            stack.push(stack2.pop());
    }
}
