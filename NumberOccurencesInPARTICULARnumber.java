import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        //Number of occurences of 7 in number
        Scanner in = new Scanner(System.in);
        int count = 0;

        //LOGIC 1
        int num = in.nextInt();
        String a = Integer.toString(num);
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='7')
            {
                count += 1;
            }
        }

        /*//LOGIC 2
        int num = in.nextInt();
        int rem;
        while(num>0){
            rem = num%10;
            if(rem == 7)
                count+=1;
            num = num/ 10;
        }*/
        
        System.out.println(count);
    }
}

