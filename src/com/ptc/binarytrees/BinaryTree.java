package com.ptc.binarytrees;

public class BinaryTree {

  public   Node root ;

   public BinaryTree(){
        root = null;
    }

   public  BinaryTree(int item){

        root = new Node(item);
    }
}
