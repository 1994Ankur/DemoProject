package com.ptc;
import java.util.Scanner;
import com.ptc.MinMaxDivideCon;
import com.ptc.arrays.Arrays;

public class ReadInput {

    public void readInputForSum(){
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[11];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the next element");
            array[i] = scanner.nextInt();

        }

        System.out.println("Enter value to be searched");
        int value = scanner.nextInt();

        Arrays arrays = new Arrays();
       if(arrays.binarySearch(array,0,array.length-1,value))
           System.out.println("value present");
       else
           System.out.println("value not present");


    }




}
