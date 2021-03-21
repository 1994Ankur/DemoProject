package com.ptc;
import java.util.Arrays;

public class ArrayAlgorithm {

    public boolean binarySearchIterative(int[]array, int element){
        int left = 0;
        int right = array.length -1 ;
        int loop = 0;
        while(left <= right) {
            loop++;System.out.println("Entering loop  time" +"         "+loop);


            int mid = (left + right) / 2;
            System.out.println("Mid value: "+mid+ "loop value"+loop);



            if (array[mid] == element) {
                return true;
            } else if (element < array[mid]) {
                right = mid - 1;
                System.out.println("Right Value: "+right + "loopvalue::"+loop);
            } else {
                left = mid + 1;
                System.out.println("Right Value: "+left+"oopvalue::"+loop);
            }
        }
        return false;
    }



    //Algorithm to find out the trasition element in sorted array of 0 and 1 using binary search

    public int findTransitionPoint(int[] array){
        int left = 0;
        int right = array.length -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (array[mid] == 0) {
                left = mid + 1;
            } else {
                if (mid == 0 || (mid > 0 && array[mid - 1] == 0)) {
                    return mid;
                }
                right = mid - 1;
            }

        }
        return -1;


    }

    // Algorithm to find the max element in increasing array or after decreasing Bitcoin Algo geeks for geeks

    public int bitcoinAlgo(int[] array){
        int lastindex = array.length -1;
        System.out.println(lastindex);
        int left = 0;
        int right = array.length -1;

        while(left <= right) {


            int mid = (left + right) / 2;
            if(mid == lastindex)
                return lastindex;
            if(array[mid] > array[mid -1] && array[mid] > array[mid + 1])
                return mid;


            if(array[mid] > array[mid -1] && array[mid] < array[mid + 1])
                left= mid + 1;
            else
                right = mid -1;


        }
       // System.out.println(""+array.length-1);


        return lastindex ;
    }


    //Sorting element 0's 1's and 2's

    public void Sort(int[] array){
        int zerocount = 0;
        int onecoun = 0;
        int twocount = 0;

        for(int index = 0; index < array.length -1; index++){
            if(array[index] == 0)
                zerocount++;
            else if(array[index] == 1)
                onecoun++;
            else
                twocount++;
        }
        for(int i =0 ; i < zerocount;i++ )
            array[i] =0;
        for(int j = zerocount; j<onecoun + zerocount;j++)
            array[j] = 1;
        for (int k = zerocount + onecoun; k<zerocount+onecoun+twocount;k++)
            array[k] = 2;


        for(int f = 0 ; f < array.length-1; f++ )
            System.out.println(array[f]);
    }


    public void reverseArray(int[] array){

        int firstIndex,lastIndex;
        firstIndex = 0;
        lastIndex = array.length -1 ;

        while(firstIndex < lastIndex){

           int  temp = array[firstIndex];
           array[firstIndex] = array[lastIndex];
           array[lastIndex]  = temp;

           firstIndex++;
           lastIndex--;



        }

    }

    /*___________________________________________________________________________________*/

    // Recursive Reverse Program

    public void reverseRecursivelyArray(int[] array,int start, int last){

        if (start >= last)
            return;

        int temp = array[start];
        array[start] = array[last];
        array[last] = temp;

        reverseRecursivelyArray(array,start+1,last-1);

    }


}
