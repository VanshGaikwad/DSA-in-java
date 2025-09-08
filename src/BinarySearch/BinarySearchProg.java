package BinarySearch;

public class BinarySearchProg {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target=7;
        System.out.println(binarySearch(arr,10));
    }
//    return index
    static int binarySearch (int[] arr ,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
//            find mid
//            int mid = (start+end) / 2; //might be possible that (start+ end) exceeds range of integer in java
            int mid= start+(end-start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start =mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }
}
