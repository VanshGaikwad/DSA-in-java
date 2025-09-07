package LinearSearch;

public class SearchinString {
    public static void main(String[] args) {
        String name = "Vansh";
        char target = 'g';
//        System.out.println(search(name,target));
        System.out.println(search2(name,target));
    }
    static  boolean search (String str,char target){
       if(str.length()==0){
           return false;
       }
       for(int i=0; i<str.length();i++){
           if (target == str.charAt(i)){
               return true;
           }
       }
       return false;
    }

//    using for each
    static boolean search2 ( String str , char target){
        if(str.length()==0){
            return  false;
        }
        for(char c : str.toCharArray()){
            if(c == target){
                return true;
            }
        }
        return false;
    }
}
