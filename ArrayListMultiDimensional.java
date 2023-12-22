import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String>name = new ArrayList<>(10);
        ArrayList<ArrayList<Integer>>multiArrayList = new ArrayList<>();

        //initialisation
        for(int i=0;i<4;i++){
            multiArrayList.add(new ArrayList<>());
        }

        //add elements
        for(int i=0;i<4;i++){
            for (int j = 0; j < 4; j++) {
                multiArrayList.get(i).add(in.nextInt());
            }
        }

        //Displaying ArrayList
        for(int i=0;i<4;i++){
            for (int j = 0; j < 4; j++) {
                System.out.print( multiArrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
