package Functions;

public class Swap {
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
        System.out.println("Before swapping a: "+ a + ", b: "+b);

    swap( a, b );

    }

    static void swap( int a , int b ){
        //    swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping a:"+a + ", b:" + b);
    }


}
