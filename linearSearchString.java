import java.util.Arrays;
import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "Siddhant";
        char s = 'S';
        System.out.println(search(a,s));
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
}
