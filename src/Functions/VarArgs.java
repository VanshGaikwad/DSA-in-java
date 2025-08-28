package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7);
        multiple(2,3,"Vansh","Elon musk");
    }

    static  void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple( int a, int b , String ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
}
