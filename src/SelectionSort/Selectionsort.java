package SelectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] num ={8,5,6,3,4,1,2,7};
        for(int i =0; i<num.length;i++){
            int last = num.length-i-1;
            int maxIndex  = maxIndexofarr(num,0,last);
            swap(num,maxIndex,last);

        }

        System.out.println(Arrays.toString(num));

    }
    //    method to calculate max index of element
    static int maxIndexofarr (int [] arr, int start , int end){
        int max = start;
        for (int i = start ;i<=end ;i++){
            if(arr[max]<arr[i]){
                max =i;
            }
        }
        return max;
    }
    //    swap method
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
