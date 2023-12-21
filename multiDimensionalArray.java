import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] multidimensionArray = new int[3][3];
        int m = 1;
        for(int i =0 ; i<3 ; i++){
            for(int j=0 ; j<3; j++){
                multidimensionArray[i][j] = m;
                m++;
            }
        }

        for(int i =0 ; i< 3 ; i++){
            for(int j=0 ; j< 3 ; j++){
                System.out.print(multidimensionArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] multi = {{1, 2, 3},{4,5},{66,78}};

        for(int i =0 ; i< multi.length ; i++){
            for(int j=0 ; j< multi[i].length; j++){
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }


    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
