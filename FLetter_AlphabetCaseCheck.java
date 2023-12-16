import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        /*//LOGIC 1 {using Character class method}
        boolean res = Character.isLowerCase(ch);
        if(res == true)
        {
            System.out.println("It is lowercase");
        }
        else {
            System.out.println("It is uppercase");
        }*/


        /*//LOGIC 2 {using ASCII code}
        if(ch>96)
        {
            System.out.println("It is lowercase");
        }
        else{
            System.out.println("It is uppercase");
        }*/


        //LOGIC 3
        if(ch>='a'  && ch<='z')
            System.out.println("It is lowercase");
        else
            System.out.println("It is uppercase");

    }
}

