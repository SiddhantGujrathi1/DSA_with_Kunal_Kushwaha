import java.util.Arrays;
import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = in.nextInt();
        System.out.println(search(arr,target));
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i)
                min = i;
        }
        return min;
    }

    static int search(int[][] arr , int target){
        int res = 0;
        if(arr.length == 0)
            return res;
        for (int[] a:arr) {
            for(int p:a){
                if(p==target)
                    res++;
            }
        }
        return res;
    }

    static int search1(int[][] arr , int target){
        if(arr.length == 0)
            return Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target)
                    System.out.println(i+" "+j);
            }
        }
        return 0;
    }

}
