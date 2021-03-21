package com.ptc;

public class MinMaxDivideCon {
    public static Object Pair;

    /*------Class value used to return two pari from getMinMax_________________*/

    public   class Pair{

        int min;
        int max;

    }

    public   Pair getMinMax(int[] array,int low ,int high){

        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();

        int mid;
        // If there is only one element
        if(low == high){
            minmax.max = array[low];
            minmax.min = array[low];
            return minmax;
        }

        //if there is two element

        if(high == low +1 ){

            if(array[low] <= array[high]){
                minmax.min = array[low];
                minmax.max = array[high];
            }else {
                minmax.min = array[high];
                minmax.max = array[low];
            }

            return minmax;
        }


        mid = ( low + high ) / 2;
        mml = getMinMax(array,low,mid);
        mmr = getMinMax(array,mid+1, high);


        //comparing minimum of both parts

        if(mml.min < mmr.min){
            minmax.min = mml.min;

        }else {
            minmax.min = mmr.min;
        }

        //comparing max of both parts


        if(mml.max > mmr.max){
            minmax.max = mml.max;
        }else
            minmax.max = mmr.max;



        return minmax;
    }
}
