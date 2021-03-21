package com.ptc.queue;

public class CircularQueue {

    int front , rear, size;

    int capacity;

    int arrray[];

    public CircularQueue(int capacity) {

        this.capacity = capacity;
        front = rear = -1;
        this.size = 0;
        this.arrray = new int[this.capacity];


    }

    public boolean isEmpty(CircularQueue queue){

        return (queue.size == 0);

    }

    public  boolean isFull (CircularQueue queue){

        return  (queue.size == queue.capacity);

    }

    public void enqueue(int item){

    }

}
