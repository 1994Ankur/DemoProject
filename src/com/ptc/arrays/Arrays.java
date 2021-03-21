package com.ptc.arrays;

import java.math.BigInteger;
import java.util.regex.Pattern;

public class Arrays {

    public void reverseArray(int[] array) {
        int temp = 0;
        int start = 0;
        int last = array.length - 1;

        while (start < last) {
            temp = array[start];
            array[start] = array[last];
            array[last] = temp;
            start++;
            last--;

        }

        printArray(array);

    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("::" + array[i]);

        }

    }

    public void minMax(int[] array) {

        int min, max;
        min = max = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            } else {
                max = array[i];
            }

        }

        System.out.println("MIN::" + min + "MAX::" + max);

    }

    public boolean binarySearch(int[] array, int start, int end, int value) {


        if (start < end) {
            int mid;

            mid = (start + end) / 2;

            if (array[mid] == value)
                return true;

            if (array[mid] < value)
                return binarySearch(array, mid + 1, end, value);

            if (array[mid] > value)
                return binarySearch(array, start, mid - 1, value);
        }

        return false;

    }


     public BigInteger factorial(BigInteger n){
        if(n.intValue()==1)
            return BigInteger.ONE;

        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
     }

    public int fibonaciSeries(int termNumber){

        if(termNumber == 0 || termNumber ==1)
            return termNumber;

        return fibonaciSeries(termNumber-1) + fibonaciSeries(termNumber-2);


    }

    public int fibonaci(int term){
        //Base condition
        if(term == 0 || term ==1) return  term;

        //Intution
        int subproblem1 = fibonaci(term-1);
        int subproblem2 = fibonaci(term-2);

        //self work

        return subproblem1 + subproblem2;

    }

    public void printNumber(int n){
        if(n==1){
            System.out.println(""+n);
            return;

        }
        printNumber(n-1);

        System.out.println(""+n);
    }

    public  void printN(int n){
        //base condtion  smallest problem
        if(n == 0)
            return;

        System.out.println(n);

        //rescursive intution
        printN(n-1);

        if(n<=4)
        System.out.println(n+1);

        // self work
    }

    public int PartWays(int n){
        if(n==1)
            return 1;
        //base condition
        return n+PartWays(n-1);

        //Recursive intution

        //self work
    }


    public  int PowerCalculation(int a, int b){
        if(b==0)
            return 1;
        int number = PowerCalculation(a,b-1);

        return a*number;
    }

    public void Pattern(int n ,int i){

    if(n== 0)
        return;

        if(i<n){
            System.out.print("*");
            Pattern(n,i+1);
        }else{
        System.out.println();

        Pattern(n-1,0);}




       // Pattern(n-1);

        //recusrive pattern

        //self work
    }
}
