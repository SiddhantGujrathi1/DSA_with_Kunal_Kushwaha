import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        //Reverse a given number
        Scanner in = new Scanner(System.in);
      
        int count = 0;
        int num = in.nextInt();
        int res=0;
        int rem;
      
        while(num>0)
        {
            rem = num%10;
            res = rem + res*10;
            num = num/10;
        }

        System.out.println(res);
    }
}
