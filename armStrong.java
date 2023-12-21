import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int p=0;
        while(n!=0){
            n = n/10;
            p++;
        }

        int temp = n;
        int res=0;
        while(n!=0){
            int rem = n%10;
            res += Math.pow(rem,p);
            n = n/10;
        }
        if(res == temp)
            System.out.println("Yes armStrong");
        else
            System.out.println("Not a armStrong");
    }
}
