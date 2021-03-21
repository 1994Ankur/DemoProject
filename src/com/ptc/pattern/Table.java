package com.ptc.pattern;

import java.util.ArrayList;
import java.util.LinkedList;

public class Table {



    public void printFirstPattern(int i, int j){

        int row = i;
        int column = j;

        for(int k = 1; k<= row;k++){

            for (int l = 1; l <=k; l++) {

                System.out.print("*");


            }
            System.out.println("");
        }

        }
       /*----------------------------------------------------*/

    public void rightTriangleStarPattern(int i, int j){

        int rows =i;
        int columns =j ;

        for (int r = 1; r <=rows ; r++) {

            //Print the blank spaces

            for (int c = 1; c <=columns-r; c++) {

                System.out.print(" ");


            }

            //Print the *
            for (int k = 1; k <=r ; k++) {
                System.out.print("*");

            }

            //Break the line

            System.out.println("");

        }


    }

    /*__________________________________Pyramid________________*/

    public void printPyramid(int rowCount){

        int columns = 2 * rowCount - 1;

        for (int i = 1; i <=rowCount ; i++) {

            for (int j = 1; j <=columns ; j++) {

                if (j>= rowCount -(i-1) && j<= rowCount+(i-1)) {
                    System.out.print("*");
                }else
                    System.out.print(" ");

            }
            System.out.println("");

        }


    }





            
        }



