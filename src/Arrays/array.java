package Arrays;

public class array {
    public static void main(String[] args) {
//        Arrays: collection of element of same datatypes stored in contiguous memory location
//        and accessed using an index.

/*         syntax:
        datatype[] var_name = new data_type [size];

*/

        int[] rnos1 = new int [5];
//        directly
        int[] rnos2 = {23, 12, 25, 77};

//Deep dive into array:
        int[] ros; //declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // initialization: actually here object is being created in the heap.

//        example
        int[] num ;
        num = new int[5];
        System.out.println(num[0]); //by default it contain zero

        String[] str = new String[4];
        System.out.print(str[0]); // by default it contain null


    }
}
