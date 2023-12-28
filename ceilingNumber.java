import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ceilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = ceil(arr,20);
        if(ans < arr.length)
            System.out.println(arr[ans]);
        else
            System.out.println("Ceiling number not exist");

    }

    static int ceil(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int a = 0;
        int b = arr.length - 1;
        while (a <= b) {
            int mid = a + (b - a) / 2;
            if (arr[mid] < target) {
                a = mid + 1;
            } else if (arr[mid] > target) {
                b = mid - 1;
            } else if (arr[mid] == target)
                return arr[mid];
            }
            return a;
    }
}









