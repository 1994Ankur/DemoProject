package com.ptc;

import java.util.Arrays;

public class ArrayElementSum {

    //Counting Sum of Element

    public  int sumElement(int array[], int size){
        int sum = 0;
        for(int index = 0; index < size ; index++)
            sum += array[index];
        return sum;
    }

    //Counting No of zersos

    public int countZero(int array[],int size){
        int zeroCount = 0;
        for(int index = 0 ; index < size; index++){
            if(array[index] == 0)
                zeroCount++;

        }

        return zeroCount;
    }

    //Segregate 0 and 1 with a singlePass

    public int[] segregate0and1(int array[], int size){
        int left = 0;
        int right = size -1;
        while(left < right){

            //Serach for 1 from left side
            while(array[left] == 0 && left< right)
                left++;
            while(array[right] == 1 && left< right)
                right++;
            if(left < right){
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }
        return array;
    }

    //Iterative binary search

    public boolean binarySearchIterative(int[] array, int element){
        int left =0;
        int right = array.length -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == element) {
                return true;
            } else if (element < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return false;
    }
}
