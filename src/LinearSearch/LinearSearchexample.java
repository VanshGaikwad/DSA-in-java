package LinearSearch;

public class LinearSearchexample {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,2};
        int target =6;
        if(linearSearch(arr,target)){
            System.out.println("Target found");
        }
        else {
            System.out.println("Not found");
        }

    }
//    Search in array : return the index if item found
//    otherwise if item not found return -1
    static boolean linearSearch(int[] arr , int target){
        if(arr.length==0){
            return false;
        }
//        run a loop
        for(int num:arr){
            if(num == target){
                return true;
            }


        }
        return  false;
    }

}
