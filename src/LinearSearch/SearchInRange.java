package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {2,6,7,8,4};
        System.out.println(search(array,0,4,4));

    }
    static int search( int [] arr , int start, int end, int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int i =start ;i<=end;i++){
            if(arr[i] ==target){
                return i;
            }

        }
        return -1;
    }
}
