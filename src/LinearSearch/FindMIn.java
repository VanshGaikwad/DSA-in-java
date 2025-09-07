package LinearSearch;

public class FindMIn {
    public static void main(String[] args) {
        int [] arr = {5,6,2,1,-1};
        System.out.println("Minimum number in array:"+Min(arr));

    }
    static int Min(int[] arr){
        int min= Integer.MAX_VALUE;
        if (arr.length==0){
            return -1;
        }
        for (int num: arr){
            if(num<min){
                min = num;
            }
        }
        return min;
    }
}
