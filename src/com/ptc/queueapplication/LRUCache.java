package com.ptc.queueapplication;

import java.util.Deque;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

public class LRUCache {

    //Store keys of cache
  public   Deque<Integer> deque;


  //Stores reference of key in cache
  public HashSet<Integer> hashSet;

  //Maximum capacity of the cache
    public  final int Cache_Size;

    public LRUCache(int capacity){
        this.deque = new LinkedList<>();
       this.hashSet = new HashSet<>();
       this.Cache_Size = capacity;

    }

    /*Refer the page within the LRU Cahce*/

    public  void refer(int page){

        if(!hashSet.contains(page)){

            if(deque.size() == Cache_Size){
                int last = deque.removeLast();
                hashSet.remove(last);
            }
        }
        else{
            /* The found page may not be always the last element, even if it's an
               intermediate element that needs to be removed and added to the start
               of the Queue */
            deque.remove(page);
        }
        deque.push(page);
        hashSet.add(page);
    }

    public  void display(){

        Iterator<Integer> itr = deque.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+ "");
    }


}
