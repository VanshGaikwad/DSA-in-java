package BinarySearch;

public class CelingProg {
//    celing means smallest number of greater or eaual to target
public static void main(String[] args) {
    int[] arr = {2,3,5,9,14,16,18};
    int target = 15;add
    System.out.println("Celing :"+ ceiling(arr,target));
}


    static int ceiling(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) return arr[mid];  // return value directly
            else if (target < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }

        return (start < arr.length) ? arr[start] : -1; // ceiling value or -1
    }






}


