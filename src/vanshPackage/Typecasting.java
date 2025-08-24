package vanshPackage;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        Type casting
        int num =(int)(67.89f);
        System.out.println(num);

//        Automatic type promotion
        int a=257;
        byte b=(byte)(a); //257 % 256 = 1
        System.out.println(b);

        byte c=40;
        byte d=50;
        byte e=90;
        int f=(c*d)/e;
        System.out.println(f);

        int no = 'A'; //ASCII code
        System.out.println(no);

        System.out.println(2*2);
        System.out.println(2 *5.628448637f);


        byte by = 42;
        char ch = 'a';
        short sh = 1024;
        int in = 50000;
        float fl = 5.67f;
        double dl = 0.1234;
        double result = (fl * by) + (in / ch) - (dl - sh);
        //float + int - double = double
        System.out.println( (fl * by)+" " +(in / ch) +" "+ (dl - sh));
        System.out.println(result);


    }
}
