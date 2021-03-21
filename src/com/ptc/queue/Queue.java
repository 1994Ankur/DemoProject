package com.ptc.queue;

//Array Implementation of Queue

public class Queue {

    int front , rear, size;
    int capacity;
    int array[];

    public Queue(int capacity){

        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity -1;
        array = new int[this.capacity];
    }


    public  boolean isFull(Queue queue){

        return (queue.size == queue.capacity);
    }



   public boolean isEmpty(Queue queue){

        return (queue.size == 0);
    }


    public void enequeue(int item){

        if(isFull(this))
            return;

        this.rear = (this.rear+1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;

        System.out.println(item+"::enqueed to the list");
    }

    public int dequeue(){

        if(isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.array[front] = 0;
        this.front = (this.front +1)  % this.capacity;
        this.size = this.size -1;

        System.out.println(item+"items is removed");

        return  item;

    }


    public  int front(){

        if(isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.front];


    }

    public  int rear(){

        if(isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }



}
