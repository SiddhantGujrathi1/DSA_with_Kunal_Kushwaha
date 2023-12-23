import java.util.Arrays;
import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,5,9,21,14};
        System.out.println(linearSearch(arr,12));
        }

        static int linearSearch(int[] arr,int target){
        if(arr.length == 0)
            return -1;
        int p = 0;
            for (int a:arr) {
                if(a==target){
                    System.out.println();
                    return p;
                }
                p++;
            }

            return -1;
        }


}
