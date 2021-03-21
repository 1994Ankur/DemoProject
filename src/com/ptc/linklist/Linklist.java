package com.ptc.linklist;

public class Linklist {

    private Node start;
    private  int size;

    public Linklist(){
        start = null;
        size = 0;
    }


    public boolean isEmpty(){
        if(start == null)
            return true;
        else
            return false;
    }

    public int getSize(){
        return size;
    }

    //Print the linklist
    public void  viewList(){
        if(start == null)
            System.out.println("List is empty");
        else{
            Node travel = start;
            while (travel.getNext()!=null){
                System.out.println(""+travel.getData());
                travel = travel.getNext();
            }

        }
    }

    //Inserting at the start

    public void insertAtFirst(int value){

        Node node = new Node();
        node.setData(value);
        node.setNext(start);
        size++;

    }

    //Inserting at last

    public void insertAtLast(int value){
        Node travel = start;
        Node node = new Node();
        node.setData(value);
        if(isEmpty() == true)
            start = node;
        else{

            while(travel.getNext() !=null){
                travel = travel.getNext();
                travel.setNext(node);
            }

        }
        size++;

    }


}
