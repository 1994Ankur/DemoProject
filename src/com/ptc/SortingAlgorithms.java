package com.ptc;

import java.util.Arrays;

public class SortingAlgorithms {

    public void selectionSort(int[] array){
        int arraySize = array.length ;

        for(int i =0; i < arraySize -1;i++ ){

            int minindex =i;

            for(int j=i+1; j<arraySize;j++){
                if(array[j] < array[minindex]){
                    minindex =j;
                }

                //Swaplogic
            }
            int swaphelp = array[i];
            array[i] = array[minindex];
            array[minindex] = swaphelp;
        }

        for(int printindex = 0; printindex < arraySize;printindex++)
            System.out.print(array[printindex]);

    }

    //Bubble sort Algorithm

    public void bubbleSort(int[] array){

        int arraySize = array.length;
        int swap = 0;

        for(int outerindex = 0 ; outerindex < arraySize -1;outerindex++){
            for (int innerindex = 0; innerindex < arraySize -1 -outerindex; innerindex++){

                if(array[innerindex] > array[innerindex+1]){
                    swap = 1;
                    int temp = array[innerindex];
                    array[innerindex] = array[innerindex+1];
                    array[innerindex +1] = temp;
                }
            }
            if(swap == 0)
                break;
        }


        for(int printindex = 0; printindex < arraySize;printindex++)
            System.out.print(array[printindex]);

    }

    /*--------------------------------------------------------------------------------------------*/


        //Bubble sort Recursive

    public void bubbleSortR(int[] array, int n){

        if(n == 1){
            return;
        }

        for(int innerindex = 0; innerindex < n-1;innerindex++){

            if(array[innerindex]>array[innerindex+1]){

                int temp = array[innerindex];
                array[innerindex] = array[innerindex+1];
                array[innerindex+1] = temp;

            }

            bubbleSortR(array,n-1);
        }
    }

    /*----------------------------------------------------------------------*/

    // Merge Procedure

    /*--------------------------------------------------------*/


    public int[] mergeProcedure(int[] leftArray,int[] rightArray){

        //variable
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;
        int[] newArray = new int[leftArraySize+rightArraySize];

        //index variables
        int i,j,k ;
        i =0; j=0; k=0;

        //case 1

        while(i < leftArraySize && j < leftArraySize) {
            if (leftArray[i] < rightArray[j]) {
                newArray[k] = leftArray[i];
                i++;

            } else {
                newArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //case 2 if left array finnish first
        while(i == leftArraySize && j < rightArraySize) {
            newArray[k] = rightArray[j];
            j++;
            k++;
        }

        //case 3 if right arrayfinsih first
        while(i<leftArraySize && j==rightArraySize){
        newArray[k] = leftArray[i];
        i++;
        k++;
        }

        System.out.println(Arrays.toString(newArray));

        return newArray;
    }


    public void mergeSortProcedure(int[]array,int left,int mid , int right){

        //calculating left and right array size
        int leftarraySize = mid - left + 1;//+1 because left and mid can be same for base condition
        int rightarraySize = right - mid;

        //Defining array for copying the data temporary
        int[] leftArray = new int[leftarraySize];
        int[] rightArray = new int[rightarraySize];

        //Copying left array
        for(int index = 0; index < leftarraySize;index++)
            leftArray[index] = array[left +1];

        //copying right array
        for(int index = 0; index < rightarraySize; index++)
            rightArray[index] = array[mid + 1 + index];

        //Merge logic start

        int lIndex , rIndex,arrayIndex;
        lIndex=0;
        rIndex=0;
        arrayIndex= left;


        //case 1
        while(lIndex < leftarraySize && rIndex < rightarraySize) {
            if (leftArray[lIndex] < rightArray[rIndex]) {
                array[arrayIndex] = leftArray[lIndex];
                arrayIndex++;
                lIndex++;

            } else {
                array[arrayIndex] = rightArray[rIndex];
                rIndex++;
                arrayIndex++;
            }
        }

        //Case 2  copying left array
        while(rIndex == rightarraySize && lIndex < leftarraySize){
            array[arrayIndex] = leftArray[lIndex];
            lIndex++;
            arrayIndex++;

        }

        //Case 3 copying right array
        while(lIndex == leftarraySize && rIndex < rightarraySize){
            array[arrayIndex] = rightArray[rIndex];
            rIndex++;
            arrayIndex++;

        }



    }


    /*Merge Sort __________________________________________________________________*/

    public void mergeSort(int[]array,int left, int right){

        if(left < right) {

            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            mergeSortProcedure(array, left, mid, right);
        }

    }






}
