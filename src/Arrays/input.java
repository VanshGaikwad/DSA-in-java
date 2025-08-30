package Arrays;

import java.util.*;


public class input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        Array of primitives
        int[] arr = new int[5];
//        time consuming input
        arr[0]=23;
        arr[1]=45;
        arr[2]=23;
        arr[3]=45;
        arr[4]=23;
    // [23, 45, 233, 543, 3]
//        System.out.println(arr[3]);

//    input using for loop

//        for (int i = 0;i<arr.length;i++){
//            arr[i]= scn.nextInt();
//        }

//        using normal for loop
//        for (int i = 0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

//        using enhanced for loop

//        for(int num: arr){ // for every element in array, print the element
//            System.out.print(num+" "); // here num represent element of the array
//        }


//      Easy method to print array

//        System.out.println(Arrays.toString(arr));

//        Array of objects
        String[] str = new String[4];
        for (int i = 0; i< str.length; i++){
            str[i] = scn.next();
        }
        System.out.println(Arrays.toString(str));

//        Modify
        str[1]="vansh";

        System.out.println(Arrays.toString(str));


    }
}
