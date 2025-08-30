package ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MAX {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 4};
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("Max element: "+max(arr));
        System.out.println("Max element between range(3,4): "+maxBetRange(arr,3,4 ));

    }
    static int max(int[] arr){
        int maximumElement =arr[0];
        for (int i =0; i< arr.length;i++){
            maximumElement = Math.max(maximumElement,arr[i]);
        }
        return maximumElement;
    }

    static int maxBetRange( int[] arr , int index1, int index2){
        int maximumElement =arr[index1];
        for (int i =index1;i<=index2;i++){
            maximumElement = Math.max(maximumElement,arr[i]);
        }

        return maximumElement;
    }
}
