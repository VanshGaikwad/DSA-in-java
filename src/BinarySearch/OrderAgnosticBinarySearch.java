package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] inSortarr = {1,2,3,4,5,6,7};
        int[] decSortarr= {7,6,5,4,3,2,1};
        System.out.println(orderAgnosticBinarySearch(inSortarr,7));
        System.out.println(orderAgnosticBinarySearch(decSortarr,7));

    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//        find whether the array is sorted in ascending or descending order
        boolean isAsc= arr[start] < arr[end];

        while (start<=end){
            int mid = start+(end-start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}