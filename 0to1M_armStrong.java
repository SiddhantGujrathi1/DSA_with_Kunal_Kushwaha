import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int n = 0; n < 1000000; n++)
        {
            int temp = n;
            int p = 0;
            while (n != 0) {
                n = n / 10;
                p++;
            }
            n = temp;
            int res = 0;
            while (n != 0) {
                int rem = n % 10;
                res += Math.pow(rem, p);
                n = n / 10;
            }
            if (res == temp)
                System.out.print(res + " ");
            n = temp;
        }
    }
}
