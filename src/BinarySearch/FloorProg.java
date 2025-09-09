package BinarySearch;

public class FloorProg {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target= 15;
        System.out.println("Floor:"+Floor(arr,target));

    }
    static  int Floor(int [] arr ,int target){
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) return arr[mid];  // return value directly
            else if (target < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }

        return (end >= 0) ? arr[end] : -1;
    }
}
