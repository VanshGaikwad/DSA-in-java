package BinarySearch;

public class MountainArrayQuestion {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3,2,1};
        System.out.println(Mountain(arr));


    }
    static int Mountain(int[]arr) {
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]> arr[mid+1]){
//                you are in decresing part of arr
//                this mat be the ans , but look at left
//                this is why end != mid-1;

                end= mid;

            }
            else {
//                you are in asc part of array
                start = mid+1; //because we know mid + 1 element grater than  mid element

            }

        }
//        int the  end , start == end and pointing to the largest number because of 2checks
//        start and end are always trying to find max element in the above 2 checks
//        hence , when they are pointing to just one element that is max one cuz  that is what the checks sya
//        more elaboration : at every point of time for start and end ,
//        they have the best possible ans till that time
//        ans if we are saying that only item is remaining ,hence cuz of above line that is the best possible ans
//
        return start ; //you can return start or end;
    }
}
