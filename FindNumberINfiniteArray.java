import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//Find element in infinite sorted array
public class Primitive {
    public static void main(String[] args) {

        int[] a = {12,45,45,45,46,47,49,80,98,100,102,300,400,500,600,1800,2000,4500,5403,6400,7000};
        int start = 0;
        int end = 1;
        int target = 80;
        
        while(a[end] < target){
            int temp = end + 1;
            end = end + (end-start + 1)*2 ;         //size of box
            start = temp;
        }
        
        System.out.println(search(a,80,start,end));

    }


    static int search(int[] nums , int target, int a , int b){
        int start = a;
        int end = b;
        while(start <= end){
            int mid = start + (end-start)/2;
            if( target < nums[mid] )
                end = mid-1;
            else if(target > nums[mid])
                start = mid+1;
            else{
                return mid;
            }
        }
        return -1;
    }

}









