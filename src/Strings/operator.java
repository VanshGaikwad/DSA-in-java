package Strings;

import java.sql.Array;
import java.util.ArrayList;

public class operator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
//        this is same as after a few steps: "a" + "1"
//        Integer will be converted to interger that will call toString();

        System.out.println("Vansh"+new ArrayList<>());

    }
}
