package Arrays;

import java.util.*;

public class MultidimensionArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
         1 2 3
         4 5 6
         7 8 9
         */

//        int[][] arr = new int [3][]; // number of rows are mandatory cols are not mandatory

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[][] random = {
                {1, 2, 3}, //0th index
                {4, 5}, // 1st index
                {6, 7, 8, 9} // 2nd index
        };

        int[][] arr2D = new int[3][2];
//        input
        for (int row = 0; row < arr2D.length; row++){
//            for each col in every row
            for(int col = 0; col < arr2D[row].length;col++){
                arr2D[row][col] = scn.nextInt();
            }
        }

//        Output
//        for (int row = 0; row < arr2D.length; row++){
//          for each col in every row
//            for(int col = 0; col < arr2D[row].length;col++) {
//                System.out.print(arr2D[row][col]+" ");
//            }
//            System.out.println();
//        }

//        using Arrays.toString();
//        for (int row = 0; row< arr2D.length; row++ ){
//            System.out.println(Arrays.toString(arr2D[row]));
//        }

//        using enhanced for loop
        for( int[] a : arr2D){
            System.out.println(Arrays.toString(a));
        }





    }
}
