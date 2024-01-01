import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Primitive {

    public static void main(String[] args) {
        int[][] arr= {{10,20,29,40}
                     ,{15,25,35,45}
                     ,{28,27,37,49}
                     ,{33,30,38,50}
        };
        System.out.println(Arrays.toString(search(arr,49)));
        System.out.println(factorial(4));

    }

    static int[] search(int[][] matrix , int target){
        int r = 0;
        int c = matrix.length - 1;
        while(r< matrix.length && c >=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            else if(matrix[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }

    static int factorial(int n ){
        int res = 1;
        while(n!=0){
            res *= n;
            n--;
        }
        return res;
    }

}
