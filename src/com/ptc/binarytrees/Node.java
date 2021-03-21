package com.ptc.binarytrees;

//Node structure for tree

public class Node {

   public int key;
  public  Node left, right;

    public Node(){
        key =0;
        left = right = null;
    }

    public Node(int item){
        key = item;
        left = right = null;
    }
}
