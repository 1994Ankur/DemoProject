package com.ptc;

public class FourFiftyProblem1 {

    /*_________________________________________________________Finding Min Max element in an array -----------------------*/

    public void findingMinMaxBruteForce(int[] array){


        int min = array[0];
        int max = array[0];

        for(int i = 1; i < array.length;i++){

            if(array[i] < min){
                min = array[i];
            }else
                max = array[i];

        }

        System.out.println("Min element "+ min+":::max element"+max+":::");
    }
}
