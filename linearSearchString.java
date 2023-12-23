import java.util.Arrays;
import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "Siddhant";
        char s = 'S';
        System.out.println(search(a,s));
        System.out.println(search1(a,'n'));
    }
    static boolean search(String arr , char target){
        if(arr.length() == 0)
            return false;
        for (int i = 0; i < arr.length(); i++) {
            if(arr.charAt(i) == target)
                return true;
        }
        return false;
    }


    static boolean search1(String arr , char target){
        if(arr.length() == 0)
            return false;

        for (char i:arr.toCharArray())
            if(i == target)
                return true;
        return false;
    }


}
