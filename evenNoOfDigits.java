import java.util.Arrays;
import java.util.Scanner;

public class evenNoOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {12, 34, 564, 2345, 0};
        int res = 0;
        for (int i : nums) {
            if (noOfdigits(i) % 2 == 0)
                res++;
        }
        System.out.println(res);
        System.out.println(noOfdigits1(15));
    }

    static int noOfdigits(int num) {
        if (num == 0)
            return 1;
        int p = 0;
        while (num != 0) {
            num = num / 10;
            p++;
        }
        return p;
    }

    static int noOfdigits1(int num) {
        if(num==0)
            return  1;
        return (int) (Math.log10((double) num) + 1);
    }
}
