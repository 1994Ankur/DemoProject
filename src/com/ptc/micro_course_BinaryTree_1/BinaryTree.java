package com.ptc.micro_course_BinaryTree_1;

import com.ptc.queue.QNode;
import com.sun.org.apache.xpath.internal.objects.XNodeSet;

import java.util.Scanner;

public class BinaryTree {

    private class Node{
        int data ;
        Node left;
        Node right;
    }

    private  Node root;

    private int size;

    //Constructor
    public  BinaryTree(){
        this.root = takeInput(new Scanner(System.in),null,true);
    }

    //parent denotes the value  of parent node
    //ilc -> represent if its the left node
    public Node takeInput(Scanner scanner,Node parent , boolean ilc){

        if(parent == null){
            System.out.println("Root node data?");
        }else{
            if(ilc){
                System.out.println("Enter the value of left child of "+parent.data);
            }else{
                System.out.println("Enter the value of right child of "+parent.data);
            }
        }

        int value = scanner.nextInt();
        Node nn = new Node();
        nn.data = value;

        this.size++;

        System.out.println(nn.data+"has left child?");
        boolean hlc = scanner.nextBoolean();

        if(hlc)
            nn.left= takeInput(scanner,nn,true);

        System.out.println(nn.data+"has right child");
        boolean hrc = scanner.nextBoolean();

        if (hrc)
            nn.right= takeInput(scanner,nn,false);

        return nn;

    }

    public  void display(){
        System.out.println("----------------------");
        display(this.root);
        System.out.println("________________________");
        
    }

    private void display(Node root) {

        if(root == null)
            return;

        String str="";

        if(root.left == null){
            str +=".";
        }else{
            str+= root.left.data;
        }


        str += "=>" +root.data+"<=";

        if (root.right == null)
            str+=".";
        else
            str+= root.right.data;

        System.out.println(str);

        display(root.left);
        display(root.right);


    }
}
