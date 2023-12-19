import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n+ " is Prime Number1: " + isPrime1(n));
        System.out.println(n+ " is Prime Number2: " + isPrime2(n));
    }

    static boolean isPrime1(int n){
        boolean flag = true;

        for(int i=1;i<10;i++) {
            if(n%i == 0 && n!=i && i!=1)
                flag = false;
        }

        if(n==1)
            flag = false;

        return flag;
    }

    static boolean isPrime2(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }

}
