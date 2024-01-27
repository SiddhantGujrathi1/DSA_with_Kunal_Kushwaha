import java.util.Arrays;

/*

Best Case : O(1)
Worst Case : O(n2)
Stable Sorting Algorithm
*/
public class BubbleSort_kk {
    public static void main(String[] args) {
        int[] arr = {23,45,12,56,24,13,7};
        System.out.println("Before Sorting..");
        for (int a:arr) {
            System.out.print(a+" ");
        }

        bubble(arr);
        System.out.println("\nAfter Sorting..");
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped = false;

        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {

            //for each step, max item come at last respective index
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                    swapped = true;
                }
            }

            //if it not swapped a single pair that means all pairs are swapped from start
            if(!swapped){
                break;
            }

        }
    }

    static void swap(int[] arr , int pos1 , int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

}
