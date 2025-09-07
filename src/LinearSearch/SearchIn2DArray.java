package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,6},
                {18,19,20},
                {14,2}
        };
        int target = 2;
        int[]ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println("Max value in 2D array:"+ max(arr));
    }
    static int[] search(int [][] arr, int target){

        for (int row = 0; row < arr.length ; row++ ){
            for (int col = 0; col < arr[row].length ; col++){
                if(arr[row][col] == target){
                    return new int []{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr ){
        int max = Integer.MIN_VALUE;
        for (int[] arrint : arr){
            for (int ele : arrint){
                if(ele>max){
                    max = ele;
                }
            }
        }
        return max;
    }
}
