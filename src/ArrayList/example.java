package ArrayList;
import  java.util.*;
public class example {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        Array List
//        syntax
       ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(627);
        list.add(673);
        list.add(167);
        list.add(3367);
        list.add(6746);

        System.out.println(list.contains(673));

        System.out.println(list); // we can directly print this
//        modify
        list.set(0,99);
        System.out.println(list);
//      remove
        list.remove(0);
        System.out.println(list);

//        input
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i=0; i< 5;i++){
            arrlist.add(scn.nextInt());
        }
        System.out.println(arrlist);

//        get item at any index
        for( int i = 0;i < 5;i++ ){
            System.out.print(arrlist.get(i)+" "); //pass index here, list[index] syntax will not work here
        }

    }
}
