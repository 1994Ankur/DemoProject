package com.ptc.queue;

public class QLinklist {

  QNode front, rear;

  public QLinklist(){
      this.front=this.rear = null;

  }

  void enqueue(int key){

      QNode temp = new QNode(key);

      //If queue is empty the new node is front and rear both
      if(this.rear == null){
          this.front = this.rear = temp;
          return;
      }

      this.rear.next = temp;
      this.rear = temp;
  }

  void dequeue(){

      //if queue is empty return

      if(this.front == null)
          return;

      QNode temp = this.front;
      this.front = this.front.next;

      // If front becomes NULL, then change rear also as NULL
      if (this.front == null)
          this.rear = null;
  }

}
