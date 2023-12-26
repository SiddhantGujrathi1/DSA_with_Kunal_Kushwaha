import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        int[] arr = {-18, 12, 34, 67, 78, 99, 123};   //must be sorted
        int[] arr1 = {123,45,37,23,12,-5,-78,-100};
        System.out.println(binarySearch(arr, 123, 0, arr.length - 1));
        System.out.println(binarySearch(arr, 78));
        System.out.println(orderAgnosticBinarySearch(arr1,-5));
    }

    static int binarySearch(int[] arr, int target, int a, int b) {
        if (a <= b) {
//            int middle = (int) ((b + a) / 2);     b+a may exceed int range
            int middle = (int) a + (b - a) / 2;
            if (arr[middle] == target) {
                return middle;
            } else if (target > arr[middle])
                return binarySearch(arr, target, middle + 1, b);
            else if (target < arr[middle])
                return binarySearch(arr, target, a, middle - 1);
        }
        return -1;
    }


    //Ascending order
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else
                return mid;
        }
        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end] ;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target)
                return mid;

            if(isAsc){
                if (target > arr[mid])
                    start = mid + 1;
                else if (target < arr[mid])
                    end = mid - 1;
            }
            else{
                if (target < arr[mid])
                    start = mid + 1;
                else if (target > arr[mid])
                    end = mid - 1;
            }

        }
        return -1;
    }


}







